package com.chenxing.Demo05;

/**
 * @ClassName Person
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Person {
    private String name;
    private int age;
    private String sex;
    private  String job;

    public Person() {

        System.out.println("There is no param method!");
    }

    public Person(String name){
        this();
        this.name = name;
    }

    public  Person(String name, int age){
        this(name);
        this.age = age;
    }

    public  Person(String name,int age, String sex){
        this(name, age);
        this.sex = sex;
    }

    public Person(String name, int age, String sex,String job){
        this(name,age,sex);
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
