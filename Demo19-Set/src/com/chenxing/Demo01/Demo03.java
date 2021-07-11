package com.chenxing.Demo01;

import java.util.HashSet;

/**
 * @ClassName Demo03
 * @Description: TODO Set 集合 基本使用
 * @Author: lichenxingbeijing@163.com
 */
public class Demo03 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("111");
        set.add("222");
        set.add("lala");
        set.add("4");
        // 不能包含重复的元素 没有带索引的方法 所以不能使用 普通 for 循环遍历
        //  set 集合的读写顺序 不一定一致 （底层数据结构为 Hash 表）
        // 重复内容无法添加
        System.out.println(set);
    }
}
