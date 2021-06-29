package com.chenxing.Demo01;

/**
 * @ClassName Demo05
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo05 {
    public static void main(String[] args) {
        System.out.println("Start run programming!");
        method();
        System.out.println("End run programming!");

    }

    private static void method() {
        int[] ints = new int[10];
        try {
            //ints[12] = 1;// 数组下标越界异常 非监测性异常
            ints[1]= 1 ;
            ints[20]= 1 ;
        }catch (Exception e){
            System.err.println("数组下标越界");;
            return;
        }finally {
            System.out.println("There is finally");// return 对 finally 不起作用 无论什么情况都会执行 finally
        }
    }
}
