package com.chenxing.Demo03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @ClassName Demo03
 * @Description: TODO 标准输入到文档里 调用Scanner
 * @Author: lichenxingbeijing@163.com
 */
public class Demo03 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./myTest0628a.txt"));

        String str;
        while(true){
            System.out.println("Please input content: ");
            str = new Scanner(System.in).nextLine();
            if ("over".equals(str))
                break;
            bw.write(str);
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
