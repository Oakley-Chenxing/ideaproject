package com.chenxing.Demo04;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName Demo04
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo04 {
    public static void main(String[] args) {
        Random ran = new Random();

        int blueBall = ran.nextInt(16)+1;

        int [] redBalls = new int[6];
        for (int i= 0,j; i < 6; i++) {
            int rb = ran.nextInt(6)+1;
            // 去重操作 循环实现
            for ( j = 0; j < i; j++) {
                if(rb == redBalls[j]){
                    i--;
                    break;
                }
            }
            // 没有重复的元素之后 实现赋值
            if(!(j < i)){
                redBalls[i] = rb;
            }
        }
        // 冒泡排序
        for (int i = 0; i < redBalls.length; i++) {
            for (int j = 0; j < redBalls.length-1-i; j++) {
                if (redBalls[j] > redBalls[j+1]){
                    redBalls[j] ^= redBalls[j+1];
                    redBalls[j+1] ^= redBalls[j];
                    redBalls[j] ^= redBalls[j+1];
                }
            }
        }
        System.out.println("红球为" + Arrays.toString(redBalls));
        System.out.println("蓝球为" + blueBall);
    }
}
