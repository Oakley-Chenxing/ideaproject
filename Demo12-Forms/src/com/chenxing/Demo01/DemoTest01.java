package com.chenxing.Demo01;

/**
 * @ClassName DemoTest01
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class DemoTest01 {
    public static void main(String[] args) {
        // Cat cat = new Cat(); 正常实例化对象
        // 使用多态 创建对象
        Animial animial = new Cat();
        System.out.println(animial.name);
        // System.out.println(animial.maxAge); 会报错 无法访问
        // 使用多态访问成员变量时，
        // 编译器编译根据等号左边的类 来界定 对象的类型
        // 在运行时，也是根据等号左边的类型来访问相应的成员变量
        // 编译看左，运行也看左
        System.out.println("=====================================");

        animial.eat();
        // animial.jump(); 无法访问
        // 使用多态访问成员方法时
        // 编译器编译根据定好左边的类 界定对象的类型
        // 在运行访问成员方法时
        // 根据等号右边实例化的对象来访问响应的成员方法
        // 编译看左，运行看右

    }
}
