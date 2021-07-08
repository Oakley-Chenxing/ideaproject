package com.chenxing.Demo06;

import java.util.ArrayList;

/**
 * @ClassName Demo02
 * @Description: TODO List 集合特有方法
 * @Author: lichenxingbeijing@163.com
 */
public class Demo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("格兰芬多");
        list.add("斯莱特林");
        list.add("拉文克劳");
        list.add("赫奇帕夫");

        // 通过索引 删除对象 并且返回元素
        //System.out.println(list.remove(0));

        // 通过索引修改值 并返回修改前的元素
        System.out.println(list.set(1,"哈利波特"));

        System.out.println(list.get(3));
        // 注意索引越界异常 集合中索引取值范围从 0 开始 到集合最后一个元素+1 == 集合大小-1
        System.out.println(list);
    }
}
