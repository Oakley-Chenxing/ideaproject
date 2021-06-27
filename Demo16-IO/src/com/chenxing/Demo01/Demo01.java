package com.chenxing.Demo01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName com.chenxing.Demo01.Demo01
 * @Description: TODO 字节流输出 - write 向流中写入数据
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        // 创建一个输出流的对象
        // 如果目标文件不存在，将会自动创建
        // 第二个参数如果为 true 为追加写入 运行一次 写入一会
        // 第二个参数 为 false 为覆盖写入 可省略
        FileOutputStream fos = new FileOutputStream("./myDemoTest.txt" ,true);
        // 通过输出流的对象 写入数据
        fos.write(65);// 写入一个字符 ASII 62 = A
        byte[] bytes = {65,66,67,68,69};
        fos.write(bytes);
        byte[] bytes1 = "Hello!".getBytes();// 写入完整字符串对应的字符数组
        fos.write(bytes1);
        byte[] bytes2 = "123456789".getBytes();
        fos.write(bytes2,3,4);// 从第三个开始 输入四个



        // 释放IO 资源
        fos.close();
    }
}
