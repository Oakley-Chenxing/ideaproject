package com.chenxing.Demo02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName Demo08
 * @Description: TODO FileReader & FileWriter
 * @Author: lichenxingbeijing@163.com
 */
public class Demo08 {
    public static void main(String[] args) throws IOException {
        final String src = "./myTest07.txt";
        final String to = "./myTest0777.txt";

        FileReader fr = new FileReader(src);
        FileWriter fw = new FileWriter(to);
        // 一次读取 一个 数组
        char[] chars = new char[1024];
        int len;
        while((len = fr.read(chars)) != -1){
            fw.write(new String(chars,0,len));
        }

        // 释放资源
        fw.close();
        fr.close();

    }
}
