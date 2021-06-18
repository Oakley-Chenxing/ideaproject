package com.chenxing.Demo02;

/**
 * @ClassName DemoTest02
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class DemoTest02 {
    public static void main(String[] args) {
        System.out.println(Cat.TYPE);
        Cat cat = new Cat();
        cat.eat();
        cat.Sleep();
        cat.sport();
        System.out.println("========================");

        Teacher tea = new Teacher();
        tea.eat();
        tea.Sleep();
        tea.sport();
        tea.methodAbs();
    }
}
