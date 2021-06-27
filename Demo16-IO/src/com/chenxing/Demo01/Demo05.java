package com.chenxing.Demo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName com.chenxing.Demo01.Demo05
 * @Description: TODO 字节流复制文件 一次读取一个数组
 * @Author: lichenxingbeijing@163.com
 */
public class Demo05 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./myDemoTest.txt");
        // 定义字节数组 作为读取的数据缓存
        byte[] b1 = new byte[1024]; // 1 k 空间
        // 只会输出 1k 的字符 到达 1k 会切断
        int len = fis.read(b1);
        System.out.println(new String(b1)); // 剩下的空间为空
        System.out.println("==================================");
        System.out.println(new String(b1,0,len)); // 从 0 开始 到最后一个字符结束
        System.out.println("==================================");
        System.out.println("==================================");

        // 当 文本数量 大于1k 利用数组循环输出 一次1k
//        byte[] b2 = new byte[1024];
//        int lon = 0;
//        while((lon = fis.read(b2))!= -1 ){
//            System.out.println(new String(b2,0,lon));
//        }


        // 释放资源
        fis.close();

    }
}
