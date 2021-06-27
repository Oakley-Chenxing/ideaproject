package com.chenxing.Demo02;

import java.io.*;

/**
 * @ClassName Demo09
 * @Description: TODO 缓冲区的高效率读写
 * @Author: lichenxingbeijing@163.com
 */
public class Demo09 {
    public static void main(String[] args) throws IOException {
        final String src = "./myTest07.txt";
        final String to = "./myNewTest08.txt";

        BufferedReader br = new BufferedReader(new FileReader(src));
        BufferedWriter bw = new BufferedWriter(new FileWriter(to));
        // 执行 复制操作
        char[] chars = new char[1024];
        int len;
        while((len = br.read(chars)) != -1){
            bw.write(new String(chars,0,len));
            bw.flush();
        }

        // 释放资源
        br.close();
        bw.close();

    }


}
