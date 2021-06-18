package com.chenxing.Demo01;

/**
 * @ClassName Cat
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Cat extends Animial{
     // 与父类 同名 变量
    public String name = "Cat";

    public String maxAge = "15";
// 重写 父类 方法
    @Override
    public void eat() {
        System.out.println("Cat like eat fish!");
    }
    public void jump(){
        System.out.println("Cat like jump!");
    }
}
