package com.chenxing.demo01;

/**
 * @className person
 *
 */
public class Person {
    // 成员变量 = 属性
    // 类内 方法体外 定义的变量 = 成员变量
    public String name;
    public  String sex;
    public  int age;

    // 成员方法 = 功能
    public void eat(){
        // int a = 0; // 局部变量的声明
        // int age = 0; 如果局部变量和成员变量 冲突了 局部变量会屏蔽掉 成员变量（并不会改变 成员变量的值 生存期和作用域不同）
        System.out.println("I can eat");
    }
    public void  sleep(){
        System.out.println("I can sleep");
    }
    public static void drink(){
        System.out.println("I can drink");
    }

}
