package com.chenxing.Demo01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName Demo02
 * @Description: TODO Map集合的获取
 * @Author: lichenxingbeijing@163.com
 */
public class Demo02 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("Stu01","Rola");
        map.put("Stu02","Siri");
        map.put("Stu03","Tank");
        map.put("Stu04","Umi");
//        // 通过键获取值 存在返回对应值 不存在返回null
//        System.out.println(map.get("Stu04"));
//        System.out.println("==================");

//        // 获取所有键的集合
//        Set<String> keySet = map.keySet();
//        for(String key : keySet){
//            System.out.print(key+", ");
//        }
//        System.out.println("==================");

        // 获取所有值的集合
        Collection<String> v = map.values();
        for(String val : v){
            System.out.println(val);
        }

        // 获取所有键值对 的集合
        Set<Map.Entry<String, String>> mape = map.entrySet();
        for(Map.Entry<String,String> mapes : mape){
            System.out.println(mapes);
        }

    }
}
