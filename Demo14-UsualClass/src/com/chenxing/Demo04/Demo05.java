package com.chenxing.Demo04;

import java.util.Date;

/**
 * @ClassName Demo05
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo05 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);
        System.out.println("===========================");
        Date d2 = new Date(System.currentTimeMillis());
        System.out.println(d2);
        System.out.println("===========================");
        // 根据自己指定的时间戳来获取指定的 date 对象
        Date d3 = new Date(System.currentTimeMillis()-1000*60*60*24);
        System.out.println(d3);
        System.out.println(new Date(System.currentTimeMillis()-1000*60*60*24*2));
        System.out.println("===========================");
        // 获取当前时间
        System.out.println(d2.getTime());
        System.out.println(System.currentTimeMillis());
        System.out.println("============================");
        // 设置时间
        d3.setTime(System.currentTimeMillis() + 1000*60*60);
        System.out.println(d3);


    }
}
