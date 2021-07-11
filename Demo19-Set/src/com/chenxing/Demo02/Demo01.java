package com.chenxing.Demo02;

import java.util.TreeSet;

/**
 * @ClassName Demo01
 * @Description: TODO TreeSet 基本用法
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(11);
        ts.add(88);
        ts.add(77);
        ts.add(22);
        ts.add(33);
        ts.add(33);

        System.out.println(ts);

    }
}
