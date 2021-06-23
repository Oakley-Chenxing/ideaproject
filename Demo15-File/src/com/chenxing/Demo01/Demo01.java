package com.chenxing.Demo01;
import java.io.File;
/**
 * @ClassName File
 * @Description: TODO File 中常用的构造方法
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01 {
    public static void main(String[] args) {
        // 相对路径：相当于与当前目录的某一级目录 ./表示当前目录 ../上一级目录 ../../上一级的上一级
        // 绝对路径：从跟目录起（Windows中的根目录就是盘符，Linux里根目录就是 /）,知道要访问的目录文件
        // 在计算机系统没有文件夹！！！只有目录！！！
        File file01 = new File("./myTest.txt");
        System.out.println(file01);

        File file02 = new File("./myDir/myTest.txt");
        System.out.println(file02);

        File file03 = new File("./myDir","myTest.txt");
        System.out.println(file03);

        File file04 = new File("./myDir");
        File file05 = new File(file04,"myTest.txt");
        System.out.println(file05);


    }
}
