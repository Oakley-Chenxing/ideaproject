package com.chenxing.Demo06;

/**
 * @ClassName DemoTest06
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class DemoTest06 {
    public static void main(String[] args) {
        // 使用多态传参
        WhoRun wr = new WhoRun();
        Dog d = new Dog();
        wr.show(d);
        System.out.println("=========================");
        // 匿名内部类调用
        /**
         * new Running(){
         *             @Override
         *             public void run() {
         *                 System.out.println("There is a cat running!");
         *             }
         *         }.run();
         */
        ((Running) () -> System.out.println("There is a cat running!")).run();
        // 第三种方法 lambda 表达式代替 匿名内部类调用 但是有局限

    }
}
