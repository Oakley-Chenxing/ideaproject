package com.chenxing.Demo02;


import java.util.Arrays;

/**
 * @ClassName Demo01
 * @Description: TODO 获取字符串的方法
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01 {
    public static void main(String[] args) {
        String s1 = new String();
        s1 = "Java";
        System.out.println(s1);
        System.out.println("===========================");
        char[]charArr = {'J','a','v','a'};
        String s2 = new String(charArr); // 字符数组的获取
        System.out.println(s2);
        System.out.println("=================================");
        byte[] bytes = {74,97,118,97};
        String s3 =new String(bytes);
        System.out.println(s3); // 字节数组的获取
        System.out.println("=================================");
        byte[] bytes1 = "JavaSE".getBytes();
        // System.out.println(Arrays.toString(bytes1));
        String s4 = new String(bytes1);
        System.out.println(s4);
        System.out.println("==========================");

        // 直接赋值 获取字符串
        String s5 = "Java";
        System.out.println(s5);


    }
}
