package com.chenxing.Demo06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @ClassName Demo06
 * @Description: TODO 利用 listIterator 解决并发修改异常
 * @Author: lichenxingbeijing@163.com
 */
public class Demo06 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("格兰芬多");
        list.add("斯莱特林");
        list.add("拉文克劳");
        list.add("赫奇帕夫");

        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            String str = it.next();
            if("格兰芬多".equals(str)){
              it.add("JDBC");
            }
        }
        System.out.println(list);

    }

}
