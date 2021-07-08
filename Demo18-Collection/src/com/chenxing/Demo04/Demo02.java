package com.chenxing.Demo04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName Demo02
 * @Description: TODO collection 常用方法
 * @Author: lichenxingbeijing@163.com
 */
public class Demo02 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
         c.add("格兰芬多");
         c.add("斯莱特林");
         c.add("拉文克劳");
         c.add("赫奇帕夫");
        System.out.println(c);

        // 删除操作 成功返回true 失败返回false
//        System.out.println(c.remove("格兰芬多"));
//        System.out.println(c.remove("silaiteli"));

       // c.clear();// 清空集合操作

        //System.out.println(c.isEmpty());
        // 判断集合是否为空 为空 返回true

        System.out.println(c.contains("格兰芬多"));
        // 集合中是否包含 某元素 包含返回 true

        System.out.println(c.size());
        // 返回集合中的元素个数


        System.out.println(c);
    }
}
