package com.chenxing.Demo02;

import com.chenxing.Demo01.Student;

/**
 * @ClassName GenericTest
 * @Description: TODO 不利用泛型方法 需要重写很多次 方法
 * @Author: lichenxingbeijing@163.com
 */
public class GenericTest {
    public static void main(String[] args) {
        Generic g = new Generic();
        g.show(27149);
        g.show("Hello 27149！");
        g.show(2.71f);
        g.show(2.71);
        g.show(new Student("Oakley",21));
    }
}
