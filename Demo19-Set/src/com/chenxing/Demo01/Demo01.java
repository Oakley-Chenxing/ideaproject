package com.chenxing.Demo01;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

/**
 * @ClassName Demo01
 * @Description: TODO 双色球 Set 版
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01 {
    public static void main(String[] args) {
        Random random = new Random();

        int blueBall = 0;
        blueBall = random.nextInt(16)+1;// 蓝球的取值范围是1-16

        //HashSet<Integer> redBalls = new HashSet<>();
        TreeSet<Integer> redBalls = new TreeSet<>();// 有序 set 集合 逻辑顺序
        while (redBalls.size()<6){
            redBalls.add(random.nextInt(33)+1);// 红色球的取值范围是1-33
        }
        System.out.println("蓝球: " + blueBall);
        System.out.println("红球: " + redBalls);
    }
}
