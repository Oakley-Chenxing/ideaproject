package com.chenxing.Demo01;

/**
 * @ClassName Student
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
