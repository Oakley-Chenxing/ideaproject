package com.chenxing.Demo05;

/**
 * @ClassName Outer
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Outer {
    public void outerMethod(){
        // 匿名内部类
        // 匿名内部类来实现 Inner 抽象类
//        new Inner() {
//            @Override
//            public void show() {
//                System.out.println("There is 内部类的方法实现01！");
//            }
//        }.show();
        // 通过匿名对象直接访问成员方法

        /**
         * 给匿名内部类起名字
         */
        Inner i = new Inner() {
            @Override
            public void show() {
                System.out.println("There is 内部类的方法实现02！");
            }
        };
        i.show();

    }
}
