package com.chenxing.demo01;

import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();// 实例化对象
        // 通过 new 关键字 实例化对象
        p.name = "Oakley"; // 给成员变量赋值
        p.sex = "male";
        p.age = 18;
        // 在定义后 如果没有为 变量进行初始化 所有成员变量的初始值为 各种0 如 null,0
        System.out.printf("%s, %s, %d\n", p.name, p.sex,p.age);
        System.out.println(p.name +" "+ p.sex + " "+ p.age);
        // 通过对象 点儿 为 成员方法
        // 通过实例化对象 开辟空间后实现 需要创建对象
        p.eat();
        p.sleep();
        // 通过类名 点儿 为 静态方法
        // 加载时 已经生效 不需要实例化 不需要创建对象
        Person.drink();
    }
}
