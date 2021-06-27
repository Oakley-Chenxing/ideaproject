package com.chenxing.Demo01;

import java.io.*;

/**
 * @ClassName com.chenxing.Demo01.Demo13
 * @Description: TODO 缓冲区字节流 每次一个数组 写入 复制
 * @Author: lichenxingbeijing@163.com
 */
public class Demo13 {
    public static void main(String[] args) throws IOException {
        final String SRC = "./Rain.mp4";
        final String TO = "./NewRain03.mp4";
        long startTime = System.currentTimeMillis();
        method04(SRC,TO);// 109 ms
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime + " ms");
    }

    private static void method04(String src, String to) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(to));
        // 缓冲区字节流 每次一个数组 写入
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        // 释放资源
        bis.close();
        bos.close();
    }
}
