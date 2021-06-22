package com.chenxing.Demo03;

/**
 * @ClassName Demo01
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01 {
    public static void main(String[] args) {
        // 常用方法
        StringBuilder s1 = new StringBuilder("Hello");
        System.out.println(s1);
        s1.append(" Oakley").append(" congraduation!");
        System.out.println(s1);
        System.out.println(s1.append(" 0622").toString());// 返回值为自己本身，可做连贯操作

        s1.reverse();
        System.out.println(s1);

    }
}
