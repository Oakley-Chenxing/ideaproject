package com.chenxing.Demo06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName Demo03
 * @Description: TODO 并发性修改异常起因
 * @Author: lichenxingbeijing@163.com
 */
public class Demo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("格兰芬多");
        list.add("斯莱特林");
        list.add("拉文克劳");
        list.add("赫奇帕夫");
        // 在创建迭代器的时候，迭代器中会有一个成员用来存储预期迭代的元素个数
         //如果这个成员在每次集合被迭代时 都会和集合的原始数据个数进行对比
           //      如何发现不一致 则会出现并发性修改异常
        // 初始化迭代器对象
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            if("格兰芬多".equals(str)){
                System.out.println("There is 哈利波特的学院！");
               // list.add("Harry");
                // .ConcurrentModificationException 出现并发现修改异常
            }
        }
        System.out.println(list);

    }
}
