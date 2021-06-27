package com.chenxing.Demo01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName com.chenxing.Demo01.Demo07
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo07 {
    public static void main(String[] args) throws IOException {
        // 将普通的字节流封装成效率更高的缓冲区字节流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./myDemoTest.txt"));
        // 一次读一个字节
        int b1;
        while((b1 = bis.read())!= -1 ){
            System.out.print((char)b1);
        }
        // 释放资源
        bis.close();

    }
}
