package com.chenxing.Demo03;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @ClassName Demo06
 * @Description: TODO 匿名对象的使用02
 * @Author: lichenxingbeijing@163.com
 */
public class Demo06 {
    public static void main(String[] args) {
        String name;
        int age;
        String sex;
        float score;

        System.out.println("Please input your name: ");
        name = new Scanner(System.in).nextLine();
        System.out.println("Please input your age: ");
        age = new Scanner(System.in).nextInt();
        System.out.println("Please input your sex ");
        sex = new Scanner(System.in).nextLine();
        System.out.println("Please input your score ");
        score = new Scanner(System.in).nextFloat();

        System.out.printf("name=%s, age=%d, sex=%s, score=%.2f\n",name,age,sex,score);
    }
}
