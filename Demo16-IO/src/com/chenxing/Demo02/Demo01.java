package com.chenxing.Demo02;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @ClassName Demo01
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s01 = "a6霍";
        byte[] b1 = s01.getBytes("UTF-8");
        System.out.println(Arrays.toString(b1));
        // 如果是 UTF-8 字节, 占用三个字节
        System.out.println("=====================");
        byte[] b2 = s01.getBytes("GBK");
        // 如果是 GBK 字节, 占用 2 个字节
        System.out.println(Arrays.toString(b2));
        // 字节流当中汉字的字符编码是负数值
        System.out.println("====================");
        byte[] b3 = s01.getBytes();
        System.out.println(Arrays.toString(b3));
        // 默认返回的 形式为 UTF - 8
    }
}
