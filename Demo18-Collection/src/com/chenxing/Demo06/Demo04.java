package com.chenxing.Demo06;

import java.util.ArrayList;

/**
 * @ClassName Demo04
 * @Description: TODO 并发性修改异常处理
 * @Author: lichenxingbeijing@163.com
 */
public class Demo04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("格兰芬多");
        list.add("斯莱特林");
        list.add("拉文克劳");
        list.add("赫奇帕夫");
        //  普通 for 循环集合 -- 万能
        for (int i = 0; i < list.size(); i++) {
            if("拉文克劳".equals(list.get(i))){
                list.add(i+1,"哈利波特");
            }

        }
        System.out.println(list);

    }
}
