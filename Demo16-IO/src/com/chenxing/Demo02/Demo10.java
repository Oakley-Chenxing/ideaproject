package com.chenxing.Demo02;

import java.io.*;

/**
 * @ClassName Demo10
 * @Description: TODO 缓冲区的 特有方法
 * BufferedWriter类 - void newLine(): 行分隔符, 根据不同系统写入分隔符
 * BufferedReader类 - String readLine(): 读一行文字, 不包括换行符, 读完返回null
 * @Author: lichenxingbeijing@163.com
 */
public class Demo10 {
    public static void main(String[] args) throws IOException {
        final String src = "./myTest07.txt";
        final String to = "./myNewTest09.txt";

        BufferedReader br = new BufferedReader(new FileReader(src));
        BufferedWriter bw = new BufferedWriter(new FileWriter(to));
        //System.out.println(br.readLine());
        String line;
        // 读一行文字, 不包括换行符, 读完返回null
        while ((line = br.readLine())!= null){
            // 写入到新的文件
            bw.write(line);
            bw.newLine(); // 行分隔符, 根据不同系统写入分隔符
            bw.flush();
        }

        br.close();
        bw.close();
    }
}
