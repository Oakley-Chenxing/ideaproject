package com.chenxing.Demo01;

/**
 * @ClassName Cat
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Cat implements Animal{
    // 重写三个方法
    // alt + insert OR ctrl + o
    // 注解 在编译过程中 提示错误
    @Override
    public void eat() {
        System.out.println("Tom like eat fish!");
    }

    @Override
    public void sport() {
        System.out.println("Tom like catch mouse!");
    }

    @Override
    public void sleep() {
        System.out.println("Tom like sleep at bed!");
    }
}
