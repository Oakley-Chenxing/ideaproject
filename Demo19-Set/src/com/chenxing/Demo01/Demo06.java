package com.chenxing.Demo01;

import java.util.LinkedHashSet;

/**
 * @ClassName Demo06
 * @Description: TODO LinkedSet 特点
 * @Author: lichenxingbeijing@163.com
 */
public class Demo06 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("11");
        set.add("77");
        set.add("88");
        set.add("45");
        set.add("46");
        set.add("22");

        for(String str : set){
            System.out.println(str);
        }

    }
}
