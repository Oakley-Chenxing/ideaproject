package com.chenxing.Demo03;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

/**
 * @ClassName Demo07
 * @Description: TODO 标准输出
 * @Author: lichenxingbeijing@163.com
 */
public class Demo07 {
    public static void main(String[] args) throws IOException {
//        PrintStream out = System.out;
//        OutputStreamWriter osw = new OutputStreamWriter(out);
//        BufferedWriter bw = new BufferedWriter(osw);

        // 匿名类调用
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Hello World!");

        //正常输出
        System.out.println("Hello \\World! (println)");// 输出一个单斜线
        System.out.print("Hello World!(print)\n");
        System.out.printf("Hello %20s World","&&");// 右对齐
        System.out.printf("\nHello %-20s World","&&");// 左对齐

        bw.close();
    }
}
