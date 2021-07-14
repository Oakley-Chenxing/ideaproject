package com.chenxing.Demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @ClassName Demo01
 * @Description: TODO collections 工具类的常用方法
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("123456789");
        list.add("1234567");
        list.add("123456");
        list.add("12345");
        list.add("1236");
        list.add("125");
        list.add("12");
        // 排序
        // 自然规则排序 Collections.sort(list);

//        自定义规则排序
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        });

//  逆序存储  Collections.reverse(list);

        // 随机排列
        Collections.shuffle(list);

        for(String str : list){
            System.out.println(str);
        }
    }

}
