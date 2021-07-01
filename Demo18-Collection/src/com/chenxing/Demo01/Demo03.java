package com.chenxing.Demo01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName Demo03
 * @Description: TODO ArrayList 的遍历
 * @Author: lichenxingbeijing@163.com
 */
public class Demo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("格兰芬多");
        list.add("斯莱特利");
        list.add("赫琦帕夫");
        list.add("拉文克劳");
        list.add("哈利波特");

        // 方法一
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        // 方法二 增强 for 循环
//        for (String str : list){
//            System.out.println(str);
//        }

        // 方法三 迭代器
//        Iterator<String> it = list.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        // 方法四 通过 stream 实现
//        list.stream().forEach(System.out::println);
          list.forEach(System.out::println); // 省略 stream 的写法
    }
}
