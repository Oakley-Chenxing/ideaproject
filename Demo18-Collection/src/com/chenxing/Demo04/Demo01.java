package com.chenxing.Demo04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName Demo01
 * @Description: TODO 集合的使用
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        c.add("格兰芬多");
        c.add("斯莱特利");
        c.add("拉文克劳");
        c.add("赫福帕夫");
        System.out.println(c);
    }
}
