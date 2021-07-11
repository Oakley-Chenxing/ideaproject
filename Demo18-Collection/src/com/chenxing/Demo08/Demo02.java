package com.chenxing.Demo08;

import java.util.LinkedList;

/**
 * @ClassName Demo02
 * @Description: TODO linkedList 中常用方法
 * @Author: lichenxingbeijing@163.com
 */
public class Demo02 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("111");
        ll.add("222");
        ll.add("333");
        ll.add("444");
        System.out.println(ll);

        ll.addFirst("000");
        //ll.addLast("555");
        ll.add(ll.size() ,"555");
        System.out.println(ll);

        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        System.out.println(ll);

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.get(ll.size()-1));
    }
}
