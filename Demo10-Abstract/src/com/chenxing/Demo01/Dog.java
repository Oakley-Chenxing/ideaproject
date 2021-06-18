package com.chenxing.Demo01;

/**
 * @ClassName Dog
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Dog extends Animial {
    // 构造方法
    public Dog(String type) {
        super(type);
    }

    @Override
    public void eat() {
        System.out.println(this.getType() + " can eat meat!");
    }

    @Override
    public void sport() {
        System.out.println(this.getType() + " can protect gate!");
    }
}
