package com.chenxing.Demo01;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * @ClassName Demo02
 * @Description: TODO 模拟斗地主发牌
 * @Author: lichenxingbeijing@163.com
 */
public class Demo02 {
    public static void main(String[] args) {
        HashMap<Integer, String> card = new HashMap<>();// 扑克盒
        ArrayList<Integer> indexList = new ArrayList<>(); // 索引
        // 花色和点数
        String[] colors = {"♥","♠","♦","♣"};
        String[] nums = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        // 将花色和点数 组织好 放到扑克盒里面
        // 创建索引
        int index=0;
        // 遍历点数
        for(String color:colors){
            // 遍历花色
            for(String num:nums){
                // 拼装
                card.put(index,color+num);// 把 花色和点数 以及对应的索引 放到 扑克盒里面
                indexList.add(index++);// 没遍历一次 索引自增 +1
            }
        }// 处理的是普通牌

        // 大小王单独处理
        card.put(index,"dawang");
        indexList.add(index++);
        card.put(index,"xiaowang");
        indexList.add(index);

        // 洗牌
        Collections.shuffle(indexList);// 将 ArrayList 中存放的扑克打乱顺序

        // 定义玩家
        TreeSet<Integer> player01 = new TreeSet<>();// 把每个玩家的牌 放到TreeSet集合中
        TreeSet<Integer> player02 = new TreeSet<>();
        TreeSet<Integer> player03 = new TreeSet<>();
        TreeSet<Integer> last3Card = new TreeSet<>();

        // 发牌
        for (int i = 0; i < indexList.size(); i++) {// 遍历索引集合
            if(i >= indexList.size()-3){// 遍历到最后三个元素 写入到底牌中
                last3Card.add(indexList.get(i));
            }else{
                switch (i % 3){
                    case 0:player01.add(indexList.get(i));break;// 每人发一张牌
                    case 1:player02.add(indexList.get(i));break;
                    case 2:player03.add(indexList.get(i));break;
                }
            }
        }
        // 看牌
        showCard("Andy",player01,card);
        showCard("Bill",player02,card);
        showCard("Cate",player03,card);
        showCard("DiPai",last3Card,card);
        System.out.println(index);


    }

    /**
     *
     * @param name
     * @param ts
     * @param card
     */
    private static void showCard(String name, TreeSet<Integer> ts, HashMap<Integer, String> card) {
        System.out.println(name + ": ");
        for(Integer key:ts){//遍历 TreeSet 集合
            System.out.print(card.get(key)+" ");
        }
        System.out.println("\n=================================");
    }
}
