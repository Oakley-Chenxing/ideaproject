package com.chenxing.Demo04;

import java.io.Serializable;

/**
 * @ClassName Student
 * @Description: TODO 创建一个学生类
 * @Author: lichenxingbeijing@163.com
 */
public class Student implements Serializable { // 如果这个类将被序列化，必须要实现 Serializable 接口
    private String name;
    private String sex;
    private transient int age; // 屏蔽年龄的方法
    private float score; // 后续类中创建新的成员变量 更新toString 方法
    // 为了保留之前序列化的对象 定义一个私有的静态成员变量
    private static final long  serialVersionUID = -947011206577385242l;

    // 后续开发中 类中 创建新的方法
    public static void method(){
        System.out.println("There is new member method ");
    }

// 构造方法 无参 + 有参

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    // set & get

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
