package com.chenxing.Demo02;

/**
 * @ClassName Teacher
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Teacher extends Person{
    @Override
    public void eat() {
        System.out.println("Wei like eat mantou!");
    }

    @Override
    public void sport() {
        System.out.println("Wei like play math!");
    }

    @Override
    public void Sleep() {
        System.out.println("Wei like play in sleep!");
    }
// 重写 抽象类中的抽象方法
    @Override
    public void methodAbs() {
        System.out.println("Wei Shen NB!");
    }
}
