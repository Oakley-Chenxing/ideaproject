package com.chenxing.Demo01;

/**
 * @ClassName AnimialTest
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class AnimialTest {
    public static void main(String[] args) {
        System.out.println(Cat.TYPE);
        // 静态成员的调用方式 类名. 成员
        // 使用 static 修饰的成员 在类首次出现的时候会被加载
        Cat cat = new Cat();
        cat.eat();
        cat.sport();
        cat.sleep();

        System.out.println("=============================");
        System.out.println(Dog.TYPE);
        Dog dog = new Dog();
        dog.eat();
        dog.sport();
        dog.sleep();
    }
}
