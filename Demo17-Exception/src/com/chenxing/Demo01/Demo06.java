package com.chenxing.Demo01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName Demo06
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo06 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("./myTest0629c.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("文件未找到！");
        }finally {
            if(null != fr) {
                try {
                    fr.close();
                    // 不管出不出现异常 都要执行 释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            // 子类和父类 都采用Exception 处理异常 不会出现错误
        }


    }
}
