package com.chenxing.Demo01;

import java.util.Objects;

/**
 * @ClassName Student
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Student {
    private String name;
    private  int age;
    // 构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // toString()

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    // 重写hashcode & equals 方法

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
