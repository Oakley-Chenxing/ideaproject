package com.chenxing.Demo04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @ClassName Demo03
 * @Description: TODO 福彩双色球 机选号码生成器
 * 6 个 编号1-33 的红球
 * 1 个 变化1-16 的蓝色球
 * @Author: lichenxingbeijing@163.com
 */
public class Demo03 {
    public static void main(String[] args) {
        // 获取随机值的生成对象
        Random ran = new Random();

        // 生成蓝球
        int blueBall = ran.nextInt(16)+1;
        // 16 表示生成的范围是 0-15
        // 加一 则表示 1-16

        // 生成红色球
        int count = 0;
        ArrayList<Integer> redBalls = new ArrayList<>(); // 实例化的对象进行 integer 装箱
        while(redBalls.size() < 6){
            count++;
            int rb = ran.nextInt(6)+1;
            if (!redBalls.contains(rb))
                redBalls.add(rb);
        }
        // 排序红球序号
        Collections.sort(redBalls);
        // 输出结果：
        System.out.println("生成红球执行了： "+ count + "次");
        System.out.println("红球： " + redBalls);
        System.out.println("蓝球： " + blueBall);
    }
}
