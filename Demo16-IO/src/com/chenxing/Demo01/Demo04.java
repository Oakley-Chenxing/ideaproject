package com.chenxing.Demo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName com.chenxing.Demo01.Demo04
 * @Description: TODO 字节流复制文件
 * @Author: lichenxingbeijing@163.com
 */
public class Demo04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./myDemoTest.txt");
        FileOutputStream fos = new FileOutputStream("./myNewDemoTest.txt");
        // 从一个文本复制出来 黏贴到新的文本当中
        // 读一个字符，写一个字符
        int by = 0;
        while((by = fis.read()) != -1) {
            fos.write(by);
        }
        // 释放资源

        fis.close();
        fos.close();

    }
}
