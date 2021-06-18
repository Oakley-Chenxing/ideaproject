package com.chenxing.Demo03;

/**
 * @ClassName DemoTest03
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class DemoTest03 {
    public static void main(String[] args) {
        // 间接访问方式
        Demo03 demo03 = new Demo03();
        demo03.outerMethod();

        // 直接访问方式
        // 语法： new 外部类 . new 内部类
//        Demo03.Inner i = new Demo03().new Inner();
//        i.show();
//        System.out.println("===============================");
//        i.outerMethod();
    }
}
