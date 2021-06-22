package com.chenxing.Demo02;

/**
 * @ClassName Demo04
 * @Description: TODO StringBuilder 的构造方法
 * @Author: lichenxingbeijing@163.com
 */
public class Demo04 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        System.out.println(s1.length());
        System.out.println(s1);

        StringBuilder s2 = new StringBuilder("Oakley");
        System.out.println(s2 + "hello");
        System.out.println(s2.toString());
        System.out.println(s2.length());
    }
}
