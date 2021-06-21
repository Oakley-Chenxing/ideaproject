package com.chenxing.Demo01;

/**
 * @ClassName Demo03
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo03 {
    public static void main(String[] args){
        // int to String
            //int num = 27149;
        // 方法1 通过算数运算符实现
            //String s01 = " " + num;
        String s01 = ""+27149;
        System.out.println(s01);
        System.out.println(s01.length());
        System.out.println("=========================");
        // 方法2 通过包装类 Interger 来实现
        String s02 = Integer.toString(27149);
        System.out.println(s02);
        System.out.println(s02.length());
        System.out.println("=========================");
        // 方法3 String 自动封装
        String s03 = String.valueOf(27149);
        System.out.println(s03);
        System.out.println(s03.length());
        System.out.println("============================");

        // String to int
        // 方法 1 包装类
        Integer i01 = Integer.valueOf("27149");
        System.out.println(i01);
        System.out.println(i01 + 1);
        System.out.println("=============================");
        // 方法 2
        int i02 = Integer.parseInt("27149");
        System.out.println(i02);
        System.out.println(i02 + 1);



    }
}
