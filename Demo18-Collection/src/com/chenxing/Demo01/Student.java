package com.chenxing.Demo01;

/**
 * @ClassName Student
 * @Description: TODO 创建一个学生类
 * @Author: lichenxingbeijing@163.com
 */
public class Student {
    private String name;
    private String sex;
    private int age;

    // 构造方法 （ 有参 & 无参）

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Student() {
    }

    // set get 方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString 方法

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
