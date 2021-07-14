package com.chenxing.Demo01;

import java.util.HashMap;

/**
 * @ClassName Demo01
 * @Description: TODO Map集合的基本使用
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("Stu01","格兰芬多");
        map.put("Stu02","斯莱特林");
        map.put("Stu03","和其派赴");
        map.put("Stu04","拉文克劳");

        //System.out.println(map.remove("Stu03"));// 通过键删除 并返回被删除的值
//        map.clear(); // 清空集合
//        System.out.println(map.isEmpty()); // 判断集 合是否为空
        System.out.println(map.size());// 集合的个数
        // 判断 键 是否存在
        System.out.println(map.containsKey("Stu01"));
        // 判断值 是否存在
        System.out.println(map.containsValue("格兰芬多"));


        System.out.println(map);
    }
}
