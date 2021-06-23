package com.chenxing.Demo01;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName Demo05
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo05 {
    public static void main(String[] args) throws IOException {
        File file = new File("./myTest02.txt");
//        deleteFile(file);
       createFile(file);
    }

    /**
     *
     * @param file 要创建的 文件对象
     * @throws IOException
     */
    private static void createFile(File file) throws IOException {
        if (file.exists()){
            System.out.println(file.getName() +"文件已存在！");
        }else{
            if(file.createNewFile()){
                System.out.println(file.getName() + "文件创建成功");
            }else
                System.out.println(file.getName() + "文件创建失败");
        }
    }

    /**
     *
     * @param file 要删除的对象
     */
    private  static void deleteFile(File file){
        if(file.exists()){
            if (file.delete()){
                System.out.println(file.getName() + "删除成功！");
        }else {
            System.out.println(file.getName() + "删除失败！");
        }}
        else{
            System.out.println(file.getName() + "文件不存在");
        }
}
}
