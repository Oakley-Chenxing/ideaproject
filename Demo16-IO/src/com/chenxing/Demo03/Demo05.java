package com.chenxing.Demo03;

import java.util.Scanner;

/**
 * @ClassName Demo05
 * @Description: TODO Scanner 匿名对象的使用01 (正常不使用匿名类对象)
 * @Author: lichenxingbeijing@163.com
 */
public class Demo05 {
    public static void main(String[] args) {
        String name;
        int age;
        String sex;
        float score;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please input your name: ");
        name = sc.nextLine();// 根据换行来获取内容， 获取的是换行之前的内容
        System.out.println("Please input your age: ");
        age = sc.nextInt();
        sc.nextLine();// 清空键盘缓冲区 - 把多余的回车拿走
        System.out.println("Please input your sex: ");
        sex = sc.nextLine();
        System.out.println("Please input your score: ");
        score = sc.nextFloat();

        System.out.printf("name=%s, age=%d, sex=%s, score=%.2f\n",name,age,sex,score);

    }
}
