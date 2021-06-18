package com.chenxing.Demo05;

/**
 * @ClassName DemoTest05
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class DemoTest05 {
    public static void main(String[] args) {
//        普通方法调用
//        Outer o = new Outer();
//        o.outerMethod();
        new Outer().outerMethod();// 通过匿名对象得到想要的值
        System.out.println("================================");
        new InnerExts().show();
        System.out.println("=================================");
        // 子类继承实现show 方法的调用

        /**
         * 主方法中直接使用匿名内部类来实现 show 方法
         */
        new Inner(){
            @Override
            public void show() {
                System.out.println("主方法中直接使用匿名内部类来实现 show 方法");
            }
        }.show();
    }
}
