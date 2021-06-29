package com.chenxing.Demo04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @ClassName Demo02
 * @Description: TODO 序列化存储
 * @Author: lichenxingbeijing@163.com
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./myTest0629.txt"));
        Student student01 = new Student("Michale", "male", 18);
        oos.writeObject(student01);
        oos.close();
    }
}
