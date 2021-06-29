package com.chenxing.Demo04;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @ClassName Demo03
 * @Description: TODO 反序列化读取
 * @Author: lichenxingbeijing@163.com
 */
public class Demo03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./myTest0629.txt"));
        Student student02 = (Student) ois.readObject();// 返回的是对象类 需要进行强制类型转换
        System.out.println(student02);
        System.out.println(student02.getName());
        System.out.println(student02.getSex());
        System.out.println(student02.getAge());
        System.out.println(student02.toString());
        ois.close();

    }
}
