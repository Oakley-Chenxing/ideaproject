package com.chenxing.Demo02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @ClassName Demo04
 * @Description: TODO 字符流写入详解
 * @Author: lichenxingbeijing@163.com
 */
public class Demo04 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("myTest07.txt");
        // 将获取到的 字节流对象 封装到 字符流对象
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        // 写入一个字符
        osw.write(97 );

        // 小写字母 a

        // 写入一个数组
        char [] charArr = {'a','b','c','d','e','f','g'};
        osw.write(charArr);

        // 写入字符串
        osw.write(" I am robot!");
        // 建议手动 flush
        osw.flush();
        osw.close();
    }
}
