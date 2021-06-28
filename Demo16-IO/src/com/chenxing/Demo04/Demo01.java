package com.chenxing.Demo04;

import java.io.*;
import java.util.Arrays;

/**
 * @ClassName Demo01
 * @Description: TODO 通过之前学习过的方法 将一个对象 实现持久化存储
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        saveObiect();
        Student stu = myLoad();
        System.out.println(stu);
    }

    /**
     * 加载文件中的内容到程序 读取一个学生对象
     * @return
     */
    private static Student myLoad() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./myTest0628b.txt"));
        String info1 = br.readLine();
        // split 将字符串 根据提供的符号 拆分
        String[] split = info1.split("##");
        //System.out.println(Arrays.toString(split));
        br.close();
        return new Student(split[0], split[1], Integer.parseInt(split[2]));
    }

    /**
     * 将一个 student 对象 存储到文件里
     * @throws IOException
     */
    private static void saveObiect() throws IOException {
        // 实例化对象
        Student student = new Student("oakley", "male", 18);
        // 写入到文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("./myTest0628b.txt"));
        // bw.write(); 这里面只能写字符串
        String info = student.getName() + "##" + student.getSex() + "##" + student.getAge();
        bw.write(info);
        bw.close();

    }
}
