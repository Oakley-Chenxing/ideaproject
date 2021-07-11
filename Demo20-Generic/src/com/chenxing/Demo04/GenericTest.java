package com.chenxing.Demo04;

import com.chenxing.Demo01.Student;

/**
 * @ClassName GenericTest
 * @Description: TODO 利用泛型方法实现 最简单
 * @Author: lichenxingbeijing@163.com
 */
public class GenericTest {
    public static void main(String[] args) {
        Generic t = new Generic();
        t.show(31457);
        t.show(3.012);
        t.show("27149");
        t.show(new Student("Pat",22));

    }
}
