package com.chenxing.Demo01;

/**
 * @ClassName Cat
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Cat extends Animial{
    public Cat(String type){
        super(type);
    }


    @Override
    public void eat() {
        System.out.println(this.getType() + " can eat fish!");
    }


    @Override
    public void sport() {
        System.out.println(this.getType() + " can catch mouse!");
    }
}
