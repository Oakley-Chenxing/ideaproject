package com.chenxing.Demo01;

/**
 * @ClassName Dog
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("WangWang like eat meat!");
    }

    @Override
    public void sport() {
        System.out.println("WangWang like play ball!");
    }

    @Override
    public void sleep() {
        System.out.println("Wangwang like sleep at ground!");
    }
}
