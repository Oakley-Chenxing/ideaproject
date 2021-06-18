package com.chenxing.demo05;

public class Person {
    // 公有
    //public String name;
    private String name;
    // 私有
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        // 用过封装 保证数据的安全可靠
        if (age< 0 ||age > 150){
            System.out.println("Error age! The value will be set as 18");
            this.age = 18;
            return;
        }
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    private  void priMethod(){
        System.out.println("There is private method!");
    }
    public void pubMethod(){
        System.out.println("There is public method, then we can get private mothod!");
        this.priMethod();
    }
}
