package com.chenxing.Demo01;

/**
 * @ClassName Animal
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public abstract class Animial {
    private String type;
    // 构造方法


    public Animial() {
    }


    public Animial(String type) {
        this.type = type;
    }


    // set get 方法
    public void setType(String type) {
        this.type = type;
    }


    public String getType() {
        return type;
    }


    public abstract void eat();
    public abstract void sport();
    public void sleep(){
        System.out.println("All the animial can sleep!");
    }
}