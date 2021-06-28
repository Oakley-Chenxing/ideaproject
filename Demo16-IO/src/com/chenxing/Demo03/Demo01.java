package com.chenxing.Demo03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @ClassName Demo01
 * @Description: TODO 标准输入
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        // 手动封装 System.in
        InputStream in = System.in;
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);

        String str = br.readLine();
        System.out.println(str);
        br.close();


    }
}
