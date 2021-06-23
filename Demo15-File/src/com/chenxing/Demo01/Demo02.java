package com.chenxing.Demo01;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName Demo02
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        // 创建文件
        File file01 = new File("./myTest.txt");
        System.out.println(file01.createNewFile());
        // 成功返回 true 不成功返回 false
        // 创建目录
        File file02 = new File("./myDir");
        System.out.println(file02.mkdir());
        // 成功返回 true 不成功返回false

        // 创建多级目录
        File file03 = new File("./520/1314");
        System.out.println(file03.mkdirs());

    }
}
