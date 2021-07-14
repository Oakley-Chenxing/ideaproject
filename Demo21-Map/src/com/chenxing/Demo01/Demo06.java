package com.chenxing.Demo01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName Demo06
 * @Description: TODO HashMap 集合中存储ArrayList
 * @Author: lichenxingbeijing@163.com
 */
public class Demo06 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        ArrayList<String> l01 = new ArrayList<>();
        ArrayList<String> l02 = new ArrayList<>();
        ArrayList<String> l03 = new ArrayList<>();

        l01.add("白虎");
        l01.add("青龙");
        l01.add("朱雀");
        l01.add("玄武");

        l02.add("刘德华");
        l02.add("张学友");
        l02.add("黎明");
        l02.add("郭富城");

        l03.add("刘能");
        l03.add("赵四");
        l03.add("刘大脑袋");
        l03.add("宋晓锋");

        hm.put("江湖四大神兽",l01);
        hm.put("四大天王",l02);
        hm.put("东北F4",l03);

        // 遍历 1
//        Set<String> keySet = hm.keySet();
//        for(String key: keySet){
//            System.out.println(key);
//            ArrayList<String> list = hm.get(key);
//            for (String name : list){
//                System.out.println("\t"+ name);
//            }
//        }

        // 遍历 2
        Set<Map.Entry<String, ArrayList<String>>> es = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> e : es) {
            String key = e.getKey();
            System.out.println(key);
            ArrayList<String> list = e.getValue();
            for (String name : list){
                System.out.println("\t"+ name);
            }
        }

    }
}
