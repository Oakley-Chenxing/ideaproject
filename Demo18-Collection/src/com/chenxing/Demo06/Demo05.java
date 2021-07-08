package com.chenxing.Demo06;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @ClassName Demo05
 * @Description: TODO 双向遍历
 * @Author: lichenxingbeijing@163.com
 */
public class Demo05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("格兰芬多");
        list.add("斯莱特林");
        list.add("拉文克劳");
        list.add("赫奇帕夫");

        // 双向遍历 共有一个指针
        // ListIterator 正向遍历
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("===================");
        // ListIterator 反向遍历
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
}
