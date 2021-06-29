package com.chenxing.Demo04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @ClassName Demo04
 * @Description: TODO 练习序列化存储
 * @Author: lichenxingbeijing@163.com
 */
public class Demo04 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("./myTest0629a.txt"));
        Student student02 = new Student("GQ", "female", 18);
        oos1.writeObject(student02);// 只能写入对象类
        oos1.close();
    }
}
