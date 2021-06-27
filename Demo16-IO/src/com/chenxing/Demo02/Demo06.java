package com.chenxing.Demo02;

import java.io.*;

/**
 * @ClassName Demo06
 * @Description: TODO 字符流文件复制
 * @Author: lichenxingbeijing@163.com
 */
public class Demo06 {
    public static void main(String[] args) throws IOException {
        final String src = "./myTest07.txt";
        final String to = "./meNewTest07.txt";
        // 定义字符输入流
        InputStreamReader isr = new InputStreamReader(new FileInputStream(src));
        // 定义字符输出流
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(to));

        // 复制动作
        // 一次一个字符
        int by;
        while ((by = isr.read())!=-1){
            osw.write((char)by);
            osw.flush(); // 手动刷新
        }

        // 释放资源
        osw.close();
        isr.close();
    }
}
