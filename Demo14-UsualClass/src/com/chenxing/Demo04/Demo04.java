package com.chenxing.Demo04;

/**
 * @ClassName Demo04
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo04 {
    public static void main(String[] args) {
        //  System.out.println(System.currentTimeMillis());
        //获取当前系统时间戳 1970年1月1日 00:00:00  单位m
        long startTime = System.currentTimeMillis();
        myMethod();
        Long endTime =  System.currentTimeMillis();
        System.out.println(endTime - startTime +"ms");

    }
    public static void myMethod(){
        for (int i = 0; i < 100; i++) {
            if (i>100){
                //System.exit(0);
                // 结束JVM运行，并返回退出码
                return;
            }
            System.out.println("i = " + i );
        }
    }
}
