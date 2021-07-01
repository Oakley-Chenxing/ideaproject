package com.chenxing.Demo01;

import java.util.ArrayList;

/**
 * @ClassName Demo02
 * @Description: TODO ArrayList 中常用方法
 * @Author: lichenxingbeijing@163.com
 */
public class Demo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("格兰芬多");
        list.add("斯莱特利");
        list.add("赫琦帕夫");
        list.add("拉文克劳");
        list.add("哈利波特");

        //System.out.println(list.remove(0));// 删除成功返回被删除的元素
        // 超出范围 返回越界异常

//        System.out.println(list.remove("格兰芬多"));// 删除成功返回 true
//        System.out.println(list.remove("海格"));// 删除失败返回 false

        System.out.println(list.set(4,"邓布利多"));// 修改元素 返回修改之前的元素

        System.out.println(list.get(4));// 获取元素
        System.out.println(list.size());// 获取数组的长度
        System.out.println(list);

    }
}
