package com.chenxing.Demo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName Demo05
 * @Description: TODO 字符流读取详解
 * @Author: lichenxingbeijing@163.com
 */
public class Demo05 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./myTest07.txt");
        // 将获取到的 字节流对象 封装到 字符流对象
        InputStreamReader isr = new InputStreamReader(fis);

        // 一次读取一个字符
//        int by;
//        while((by = isr.read())!=-1){
//            System.out.print((char) by);
//        }
        // irs.read 读文件的指针指向文件末尾
        // 一次读取一个数组
        char[] chars = new char[1024];
        int len;
        while ((len = isr.read(chars)) != -1){
            System.out.println(new String(chars,0,len));
        }
        // 释放资源
        isr.close();
    }
}
