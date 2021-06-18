package com.chenxing.Demo06;

/**
 * @ClassName Dog
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Dog implements Running{
    // 实现类 重写方法
    @Override
    public void run() {
        System.out.println("The dog is running!");
    }
}
