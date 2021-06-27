package com.chenxing.Demo01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName com.chenxing.Demo01.Demo09
 * @Description: TODO 缓冲区字节流 写入
 * @Author: lichenxingbeijing@163.com
 */
public class Demo09 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("./myDemoTest04.txt"));
        // 写入数据
        bos.write("27149,587\r\n".getBytes());
        bos.write("27149,587\r\n".getBytes());
        bos.write("27149,587\r\n".getBytes());
        bos.write("27149,587\r\n".getBytes());
        // 循环写入数据
        for (int i = 0; i < 10; i++) {
            bos.write("Java\r\n".getBytes());
        }
        // 释放资源
        bos.close();
    }
}
