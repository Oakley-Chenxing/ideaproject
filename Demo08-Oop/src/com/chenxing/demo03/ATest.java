package com.chenxing.demo03;

public class ATest {
    public static void main(String[] args) {
        int x = 5;
        int y = x;
        y = 8;
        System.out.println("x= "+ x);
        System.out.println("y= "+ y);
        System.out.println("=================");
        // 定义了一个 A 类的对象 a
        A a = new A();
        //将 a 对象赋值给 b , 相当于 给 a 起了一个别名 为 b
        A b = a;
        // 操作 b 等于 操作 a
        // 操作 a 等于 操作 b
        // a b 公用相同的存储空间
        b.a = 110;
        b.b = 220;

        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(b.a);
        System.out.println(b.b);
    }
}
