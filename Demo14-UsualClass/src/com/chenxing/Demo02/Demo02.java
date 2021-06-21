package com.chenxing.Demo02;

import java.util.Scanner;

/**
 * @ClassName Demo02
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo02 {
    public static void main(String[] args) {
        String s1 =new String("Hello");
        System.out.println("S1 = " + s1);
        System.out.println("Please input a word!");
        String s2 = new Scanner(System.in).nextLine();
        if (s1 == s2){
            System.out.println("地址相等");
        }else{
            System.out.println("地址不相等");
        }
        if (s1.equals(s2)){
            System.out.println("内容相等");
        }else{
            System.out.println("内容不相等");
        }

    }
}
