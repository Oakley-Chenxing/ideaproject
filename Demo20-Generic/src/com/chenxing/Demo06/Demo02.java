package com.chenxing.Demo06;

/**
 * @ClassName Demo02
 * @Description: TODO 可变长参数 -- 方法的重写
 * @Author: lichenxingbeijing@163.com
 */
public class Demo02 {
    public static void main(String[] args) {
        System.out.println(mySum(100,58));
        System.out.println(mySum(1,1,1));
        System.out.println(mySum(mySum(1,1),1));
    }

    private static int mySum(int a, int b) {
        return a+b ;
    }
    private static int mySum(int a, int b,int c) {
        return a+b+c ;
    }
}
