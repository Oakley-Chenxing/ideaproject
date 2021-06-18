package com.chenxing.Demo01;

/**
 * @ClassName AnimialTest
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class AnimialTest {
    public static void main(String[] args) {
        //Animial cat = new Animial("Tom"); 实例化非法
        Cat cat = new Cat("Tom");
        cat.eat();
        cat.sport();
        cat.sleep();
        System.out.println("===============");

        Dog dog = new Dog("Wangwang");
        dog.eat();
        dog.sport();
        dog.sleep();
    }
}
