package com.chenxing.Demo01;

/**
 * @ClassName Dem02
 * @Description: TODO 手动处理异常
 * @Author: lichenxingbeijing@163.com
 */
public class Demo02 {
    public static void main(String[] args) {
        System.out.println("Start run programming!");
        method();
        System.out.println("End run programming!");

    }

    private static void method() {
        int[] ints = new int[10];
        try {
            ints[12] = 1;// 数组下标越界异常 非监测性异常
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            return;
        }finally {
            System.out.println("There is finally");// return 对 finally 不起作用 无论什么情况都会执行 finally
        }
    }
}
