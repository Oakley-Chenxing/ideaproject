package com.chenxing.Demo03;

/**
 * @ClassName Demo03
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo03 {
    // 外部类
    // 外部类对象
    private String strOuter = "There is the outer vary!";
    public class Inner{
        // 内部类
        public void show(){
            System.out.println("There is inner method!");
            System.out.println(strOuter);// 内部类方法调用外部类对象
        }
    }
    // 外部类方法
    public void outerMethod(){
            Inner i = new Inner(); //外部类 方法实例化内部类对象
            i.show(); // 调用内部类方法
    }

}
