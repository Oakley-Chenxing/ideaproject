package com.chenxing.Demo03;

import java.io.*;

/**
 * @ClassName Demo02
 * @Description: TODO 标准输入到文档里
 * @Author: lichenxingbeijing@163.com
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        // 通过控制台录入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 写入到文档中
        BufferedWriter bw = new BufferedWriter(new FileWriter("./myTest0628.txt"));

        String str;
        while(true){
            System.out.println("Please input the content: ");
            if ((str = br.readLine()).equals("over"))
                break;
            bw.write(str);
            bw.newLine();
            bw.flush();// 手动刷新 没有的话 不会显示 只能等到调用 .close
        }
        // 释放资源
        br.close();
        bw.close();
    }
}
