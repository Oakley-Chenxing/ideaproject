package com.chenxing.Demo08;

/**
 * @ClassName B
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class B /*extends A*/ {
    // 用final修饰的类不能被继承
    public void method(){
        final int a = 9;
        //a = 120;
        // 会报错：
        // 修饰局部变量：用final修饰的局部变量一旦被赋值则不允许修改
    }
    //final  int X;
    // 会报错
    // 修饰成员变量：用final修饰的成员变量必须初始化一个值
    final  int X = 10; // 正确方法 直接赋值
    // 构造方法赋值
    final int Y;

    public B(int y) {
        Y = y;
    }


    public final void yyds() {
        System.out.println("123456");
    }
}
