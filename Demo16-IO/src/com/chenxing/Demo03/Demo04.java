package com.chenxing.Demo03;

import java.util.Scanner;

/**
 * @ClassName Demo04
 * @Description: TODO Scanner 字符串的采集
 * @Author: lichenxingbeijing@163.com
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s1 = sc.next();
        //System.out.println(s1); // 获取字符串 但会被 白空格（空格 回车 缩进） 截断
        String s2 = sc.nextLine(); // 获取字符串 通过回车来采集一行
        System.out.println(s2);

    }
}
