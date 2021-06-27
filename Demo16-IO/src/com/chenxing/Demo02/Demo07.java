package com.chenxing.Demo02;

import java.io.*;

/**
 * @ClassName Demo08
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo07 {
    public static void main(String[] args) throws IOException {
        final String src = "./myTest07.txt";
        final String to = "./meNewTest077.txt";
        // 定义字符输入流
        InputStreamReader isr = new InputStreamReader(new FileInputStream(src));
        // 定义字符输出流
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(to));

        // 复制动作
        // 一次一个数组
        char[] chars = new char[1024];
        int len;
        while ((len = isr.read(chars))!=-1){
            osw.write(new String(chars,0,len));
            osw.flush(); // 手动刷新
        }

        // 释放资源
        osw.close();
        isr.close();
    }
}
