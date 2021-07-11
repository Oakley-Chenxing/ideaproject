package com.chenxing.Demo08;

/**
 * @ClassName Student
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;


    }
}
