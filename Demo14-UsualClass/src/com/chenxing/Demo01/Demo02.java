package com.chenxing.Demo01;

/**
 * @ClassName Demo02
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo02 {
    public static void main(String[] args) {
        // 将具体的变量 或 常量 封装成包装类对象
        Integer i = new Integer(27149);// 不推荐
        System.out.println(i);
        System.out.println("============================");
        Integer i2 = Integer.valueOf(27149); // 推荐 手动装箱
        System.out.println(i2);
        System.out.println("============================");
        Integer i3 = 27149;// 自动装箱
        System.out.println(i3);
        System.out.println("==============================");
        // 手动装箱 将字符串类类型的变量 转换成 整数类型
        Integer i4 = Integer.valueOf("1314");
        System.out.println(i4);
    }
}
