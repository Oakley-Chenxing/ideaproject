package com.chenxing.Demo01;

import java.util.ArrayList;

/**
 * @ClassName Demo01
 * @Description: TODO ArrayList 构造方法和添加方法
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01 {
    public static void main(String[] args) {
        // JDK > 1.7 支持 new 时泛型省略不写
        //  ArrayList<String> strings = new ArrayList<String>();
        // 实例化一个 空集合
        ArrayList<String> strings = new ArrayList<>();
        // 通过 add 方法向集合中添加元素
        // add(E e) 方法的功能时将元素添加到集合末尾
        strings.add("青龙");
        strings.add("白虎");
        strings.add("朱雀");
        strings.add("玄武");
        // 在指定的 索引 位置 添加元素
        // 注意下标元素不要越界 索引的取值范围从0 开始 到集合的元素个数之内
        strings.add(0,"哈利波特");

        System.out.println(strings);

    }
}
