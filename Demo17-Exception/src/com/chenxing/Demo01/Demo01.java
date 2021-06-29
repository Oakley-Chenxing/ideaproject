package com.chenxing.Demo01;

/**
 * @ClassName Demo01
 * @Description: TODO 系统默认处理异常
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println("Start run programming!");
        method();
        System.out.println("End run programming!");

    }

    private static void method() {
        int[] ints = new int[10];
        ints[12] = 1;// 数组下标越界异常 非监测性异常

    }
}
