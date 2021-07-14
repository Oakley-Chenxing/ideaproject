package com.chenxing.Demo01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName Demo03
 * @Description: TODO map集合的遍历
 * @Author: lichenxingbeijing@163.com
 */
public class Demo03 {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        hm.put("Stu01","Vicky");
        hm.put("Stu02","Windy");
        hm.put("Stu03","Xray");
        hm.put("Stu04","Zara");

//        // 方法1 直接遍历值
//        Collection<String> values = hm.values();
//        for(String value:values){
//            System.out.println(value);
//        }
//
//        // 方法2 获取所有键的集合 通过键获取值
//        Set<String> keySet = hm.keySet();
//        for(String str:keySet){
//            System.out.println(str + ", " + hm.get(str));
//        }

        // 方法 3 直接获取键值对集合 分别输出 键 和 值
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        for(Map.Entry<String, String> es: entries){
            String key = es.getKey();
            String value= es.getValue();
            System.out.println(key + ", " + value);
        }
    }


}
