package com.chenxing.Demo01;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName Demo03
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo03 {
    public static void main(String[] args) throws IOException {
        File file01 = new File("./myTest01.txt");
        file01.createNewFile();
//        - isDirectory(): 是否为目录
        System.out.println(file01.isDirectory());
//                - isFile(): 是否为文件
        System.out.println(file01.isFile());
//                - exists(): 是否存在
        System.out.println(file01.exists());
//                - getAbsolutePath(): 返回绝对路径
        System.out.println(file01.getAbsolutePath());
//                - getPath(): 返回给定的路径名字符串
        System.out.println(file01.getPath());
//                - getName(): 返回File封装的文件或目录名
        System.out.println(file01.getName());
//                - list(): 返回目录文件列表(字符串)
//                - listFiles(): 返回文件列表(对象)
    }
}
