package com.chenxing.demo04;

public class Person {
    public String name;
    public int age;

    public void eat(){
        System.out.println(this.age + " year old "+ this.name + " can eat!");
    }

    public void showEat(){
        this.eat();
    }
    public void setInfo(String name, int age){
       // System.out.println(name);
       // System.out.println(age);
       // System.out.println("==========");
        // System.out.println(this.age);
        //System.out.println(this.name);
        this.age = age;
        this.name = name;
        // 如果 局部变量 和 成员变量 同名，局部变量会屏蔽掉成员变量
        // 如果一定要 使用成员变量的话， 通过this关键字进行访问
        // this 作用 可以理解为 当前对象自己
    }
}
