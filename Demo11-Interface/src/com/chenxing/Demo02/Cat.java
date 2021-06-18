package com.chenxing.Demo02;

/**
 * @ClassName Cat
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Cat implements Animial {
    @Override
    public void eat() {
        System.out.println("Tom like eat");
    }

    @Override
    public void sport() {
        System.out.println("Tom like sport");
    }

    @Override
    public void Sleep() {
        System.out.println("Tom like sleep");
    }
}
