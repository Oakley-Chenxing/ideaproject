package com.chenxing.Demo01;

/**
 * @ClassName Demo04
 * @Description: TODO 哈希值
 * @Author: lichenxingbeijing@163.com
 */
public class Demo04 {
    public static void main(String[] args) {
        System.out.println("Hello World".hashCode());
        String str = new String("Hello World");
        System.out.println(str.hashCode());
        // 指向同一个 常量池

        // 开辟新的存储空间 存储的 hashcode 都不一样
        System.out.println(new Object().hashCode());
        System.out.println(new Object().hashCode());
        System.out.println(new Object().hashCode());
        System.out.println("=========================");

        // 哈希值不同的两个对象 肯定不是同一个对象
        // 但是即使哈希值相同也不能确定同一个对象
        // 不同的对象也可能具备相同的哈希值

        System.out.println("Aa".hashCode());
        System.out.println("BB".hashCode());

    }
}
