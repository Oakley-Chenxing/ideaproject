package com.chenxing.demo06;

/**
 * @ClassName PresonTest01
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class PresonTest01 {
    public static void main(String[] args) {
        // 通过构造方法定义一个对象 有参的
        Person p = new Person("Oakley",17);
        // 重写调用 to String 方法
        // 当输出一个对象的时候，如果有to String 方法的重写，将会被自动调用
        System.out.println(p);
        // 通过构造方法定义一个对象 无参的
        Person p1 = new Person();

    }
}
