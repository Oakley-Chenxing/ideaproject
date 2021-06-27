package com.chenxing.Demo02;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @ClassName Demo02
 * @Description: TODO 编码与解码
 * @Author: lichenxingbeijing@163.com
 */
public class Demo02 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "My name is 成龙";
        // 编码
        byte[] bytes = str.getBytes("UTF-8");
        System.out.println(Arrays.toString(bytes));
        // 解码
        System.out.println(new String(bytes,"GBK"));
        // 应该的解码方式
        System.out.println(new String(bytes,"UTF-8"));
        // 用什么格式编码 就用什么格式解码 否则会出现 乱码
    }
}
