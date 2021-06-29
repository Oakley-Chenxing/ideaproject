package com.chenxing.Demo04;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @ClassName Demo05
 * @Description: TODO 练习反序列化存储
 * @Author: lichenxingbeijing@163.com
 */
public class Demo05 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("./myTest0629a.txt"));
        Student student = (Student) ois1.readObject();// 强制类型转换
        System.out.println(student);
        ois1.close();

    }
}
