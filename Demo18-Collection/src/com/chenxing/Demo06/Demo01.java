package com.chenxing.Demo06;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Demo01
 * @Description: TODO List 集合概述
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01 {
    public static void main(String[] args) {
        // 多态形式通过List 接口的对象 存储实现类 ArrayList 集合的对象应用
        List<String> list = new ArrayList<>();
        list.add("格兰芬多");
        list.add("斯莱特林");
        list.add("拉文克劳");
        list.add("赫奇帕夫");
        list.add(4,"邓布利多");// 通过索引添加
        System.out.println(list);
    }

}
