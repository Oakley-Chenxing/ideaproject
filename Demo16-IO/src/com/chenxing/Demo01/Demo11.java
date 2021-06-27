package com.chenxing.Demo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName com.chenxing.Demo01.Demo11
 * @Description: TODO 读写效率测试 一次一个数组
 * @Author: lichenxingbeijing@163.com
 */
public class Demo11 {
    public static void main(String[] args) throws IOException {
        final String SRC = "./Rain.mp4";
        final String TO = "./NewRain01.mp4";
        long startTime = System.currentTimeMillis();
        method02(SRC,TO);// 214 ms 总运行时间
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime + " ms");
    }
    public static void method02(String src, String to) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(to);
        byte[] bytes = new byte[1024];
        int len ;
        while ((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();

    }
}
