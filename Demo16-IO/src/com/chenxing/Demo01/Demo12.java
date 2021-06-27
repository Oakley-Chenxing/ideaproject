package com.chenxing.Demo01;

import java.io.*;

/**
 * @ClassName com.chenxing.Demo01.Demo12
 * @Description: TODO 缓冲区字节流 每次一个字符 写入 复制
 * @Author: lichenxingbeijing@163.com
 */
public class Demo12 {
    public static void main(String[] args) throws IOException {
        String SRC = new String("./Rain.mp4");
        String To = new String("./NewRain02.mp4");
        long startTime = System.currentTimeMillis();
        method03(SRC,To); // 854 ms
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime + " ms");

    }

    private static void method03(String src, String to) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(to));
        // 缓冲区字节流 每次一个字符 写入
        int by;
        while ((by = bis.read())!=-1){
            bos.write(by);
        }
        // 释放资源
        bis.close();
        bos.close();


    }
}
