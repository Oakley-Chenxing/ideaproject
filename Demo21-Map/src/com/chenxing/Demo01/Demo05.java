package com.chenxing.Demo01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName Demo05
 * @Description: TODO ArrayList 集合中存储 HashMap
 * @Author: lichenxingbeijing@163.com
 */
public class Demo05 {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> list = new ArrayList<>();

        HashMap<String, String> hm01 = new HashMap<>();
        HashMap<String, String> hm02 = new HashMap<>();
        HashMap<String, String> hm03 = new HashMap<>();

        hm01.put("郭德纲","于谦");
        hm01.put("岳云鹏","孙越");

        hm02.put("迪丽热巴","古力娜扎");
        hm02.put("迅猛龙","巴旦木");

        hm03.put("哈利波特","德克尔");
        hm03.put("疾风剑豪","寒冰射手");

        list.add(hm01);
        list.add(hm02);
        list.add(hm03);

        // 遍历集合 1
//         for (HashMap<String,String> hm : list) {
//             Set<String> keySet = hm.keySet();
//             for (String key : keySet){
//                 String name = hm.get(key);
//                 System.out.println(key + ", " + name);
//             }
//             System.out.println("===============");
//         }


        // 遍历集合 2
        for (HashMap<String, String> hm : list) {
            Set<Map.Entry<String, String>> es = hm.entrySet();
            for (Map.Entry<String, String> e : es) {
                String key = e.getKey();
                String name = e.getValue();
                System.out.println(key + ", " + name);
            }
            System.out.println("===================");
        }
    }
}
