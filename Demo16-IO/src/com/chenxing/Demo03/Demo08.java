package com.chenxing.Demo03;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @ClassName Demo08
 * @Description: TODO 标准错误 System.err
 * @Author: lichenxingbeijing@163.com
 */
public class Demo08 {
    public static void main(String[] args) throws IOException {
        //System.err.println("There is a notice printed out by System.err!");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.err));
        bw.write("There is a notice printed out by System.err!");
        bw.close();
    }
}
