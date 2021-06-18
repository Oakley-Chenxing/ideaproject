package com.chenxing.Demo02;

/**
 * @ClassName Cat
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Cat extends Animal{
    public String name = "Cat";
    public String maxAge = "15";

    @Override
    public void eat() {
        System.out.println("Cat like eat fish!");
    }

    public void jump(){
        System.out.println("Cat like jump!");
    }
}
