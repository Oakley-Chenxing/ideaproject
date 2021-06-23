package com.chenxing.Demo01;

import java.io.File;
import java.util.Arrays;

/**
 * @ClassName Demo04
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo04 {
    public static void main(String[] args) {
        File file01 = new File("./");
        // -list(): 返回目录文件列表（字符串）
        System.out.println(file01.list());
        // 转换成字符串 存在数组里面
        System.out.println(Arrays.toString(file01.list()));
        // 遍历 列表
        String[] list = file01.list();
        for(String filename: list){
            System.out.println(filename);
        }

        System.out.println("=============================");
        // listFiles(): 返回文件列表（对象）
        File[] files = file01.listFiles();
        System.out.println(Arrays.toString(files));
        for (File f : files){
            System.out.println(f.getName());
        }

    }

}
