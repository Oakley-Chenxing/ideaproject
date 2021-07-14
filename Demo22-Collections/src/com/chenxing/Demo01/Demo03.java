package com.chenxing.Demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * @ClassName Demo03
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo03 {
    public static void main(String[] args) {
        // 模拟扑克牌发牌
        HashMap<Integer, String> card = new HashMap<>();// 定义扑克牌集合
        ArrayList<Integer> indexList = new ArrayList<>();// 定义索引

        //定义花色和点数
        String [] huases ={"♥","♠","♦","♣"};
        String[] dianshus={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        // 将花色和点数写入到集合当中
        int index = 0;
        // 遍历花色
        for(String huase : huases ){
            for (String dianshu :dianshus){// 遍历点数
                card.put(index,huase+dianshu);
                indexList.add(index++);
            }
        }
        // 将大小王写入到集合当中
        card.put(index,"dawang");
        indexList.add(index++);
        card.put(index,"xiaowang");
        indexList.add(index);

        // 洗牌过程
        Collections.shuffle(indexList);
        
        // 定义玩家
        TreeSet<Integer> player01 = new TreeSet<>();
        TreeSet<Integer> player02 = new TreeSet<>();
        TreeSet<Integer> player03 = new TreeSet<>();
        TreeSet<Integer> Last3card = new TreeSet<>();

        // 发牌 给玩家的集合赋值
        for (int i = 0; i < indexList.size(); i++) {
            if(i >= indexList.size()-3){
                Last3card.add(indexList.get(i));
            }else{
                switch (i%3){
                    case 0: player01.add(indexList.get(i));break;
                    case 1: player02.add(indexList.get(i));break;
                    case 2: player03.add(indexList.get(i));break;
                }
            }

        }

        // 显示玩家手中的牌
        showCard("李晨星",player01,card);
        showCard("丁浩",player02,card);
        showCard("夏宇阳",player03,card);
        showCard("底牌",Last3card,card);

    }

    private static void showCard(String name, TreeSet<Integer> player, HashMap<Integer, String> card) {
        System.out.println(name +" ");
        for (Integer id : player){
            System.out.print(card.get(id)+" ");
        }
        System.out.println("\n=================");
    }
}
