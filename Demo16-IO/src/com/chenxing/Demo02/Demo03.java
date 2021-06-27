package com.chenxing.Demo02;

import java.io.*;

/**
 * @ClassName Demo03
 * @Description: TODO 字符流的文件读写
 * @Author: lichenxingbeijing@163.com
 */
public class Demo03 {
    public static void main(String[] args) throws IOException {
        // 先写入
        //FileOutputStream fos = new FileOutputStream("./myTest0627.txt");
        // 字符流写入
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("./myTest0627.txt"),"UTF-8");
        // 使用匿名类对象 直接调用
        osw.write("Hello Oakley");
        osw.flush();// 刷新流
        osw.close();//  已经包含 刷新流 并释放字节流 关闭字符流时自动调用 fos.close()
        System.out.println("===========================");
        // 在读出
        FileInputStream fis = new FileInputStream("./myTest0627.txt");
        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
        // 一个字符 一个字符的读
        int ch;
        while ((ch = isr.read()) != -1){
            System.out.print((char)ch);
        }
        isr.close();
    }
}
