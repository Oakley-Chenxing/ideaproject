package com.chenxing.Demo01;

/**
 * @ClassName Person
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Person {
    public String name;
    public  int age;
    // 添加构造方法

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("The basic ability of human is eat!");
    }
    public void sleep(){
        System.out.println("The basic ability of human is sleep!");
    }
}
