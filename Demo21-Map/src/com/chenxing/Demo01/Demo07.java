package com.chenxing.Demo01;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * @ClassName Demo07
 * @Description: TODO 利用 Map 集合做统计
 * @Author: lichenxingbeijing@163.com
 */
public class Demo07 {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        String str = new Scanner(System.in).nextLine();

//        HashMap<Character, Integer> map = new HashMap<>();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            Integer count = map.get(key);
            if(null == count){
                map.put(key,1);
            }else{
                map.put(key,++count);
            }
        }

        // 遍历
        Set<Character> keySet = map.keySet();
        for (Character key : keySet) {
            System.out.println(key +", " + map.get(key)+" 个");
        }



    }
}
