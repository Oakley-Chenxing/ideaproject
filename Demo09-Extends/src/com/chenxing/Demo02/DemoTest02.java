package com.chenxing.Demo02;

/**
 * @ClassName DemoTest02
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class DemoTest02 {
    public static void main(String[] args) {
        Fu fu = new Fu("Oakley", 18);
        fu.eat();
        Zi zi = new Zi("Oakley", 18,"Hao",8);
        zi.eat();
        System.out.println(" =========================");
        zi.ziMethod();
    }
}