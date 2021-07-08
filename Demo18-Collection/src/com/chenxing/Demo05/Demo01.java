package com.chenxing.Demo05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName Demo01
 * @Description: TODO 迭代器
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01 {
    public static void main(String[] args) {
        Collection<String> c =new ArrayList<>();
        c.add("格兰芬多");
        c.add("斯莱特林");
        c.add("拉文克劳");
        c.add("赫奇帕奇");
        // for 增强for循环
        for(String name : c){
            System.out.println(name);
        }
        System.out.println("===========");

        //  底层实现原理
        Iterator<String> it = c.iterator();
        // hasNext 判断是否有下一个成员的方法
        while(it.hasNext()){
            System.out.println(it.next());// 输出下一个成员
        }
    }

}
