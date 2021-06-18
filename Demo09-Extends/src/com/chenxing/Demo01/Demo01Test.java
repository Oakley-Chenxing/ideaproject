package com.chenxing.Demo01;

import java.sql.SQLOutput;

/**
 * @ClassName DemoTest
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01Test {
    public static void main(String[] args) {
        Person p = new Person("Oakley",21);
        System.out.println(p.name + "," + p.age);
        p.eat();
        p.sleep();
        System.out.println("============================");

        Teacher tea = new Teacher("oakley",22,18);
        System.out.println(tea.name+ ", age:" + tea.age +", jobAge:" + tea.jobAge);
        tea.teach();
        tea.eat();
        tea.sleep();

    }
}
