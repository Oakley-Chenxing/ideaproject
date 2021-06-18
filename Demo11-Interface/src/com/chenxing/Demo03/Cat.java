package com.chenxing.Demo03;

/**
 * @ClassName Cat
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Cat implements Animial{
    @Override
    public void eat() {
        // 接口中的默认方法的调用 this.方法名
        this.showMe();
        System.out.println("Tom like eat!");
    }

    @Override
    public void sport() {
        System.out.println("Tom like sport!");
    }
}
