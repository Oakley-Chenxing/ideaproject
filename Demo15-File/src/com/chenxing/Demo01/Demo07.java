package com.chenxing.Demo01;

import java.io.File;

/**
 * @ClassName Demo07
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo07 {
    // 1.根据定义的路径创建一个File对象
    // 2.定义一个方法,用于获取给定目录下的所有内容,参数为第一步创建的File对象
    // 3.获取给定的File目录下所有的文件或者目录的File数组
    // 4.遍历File数组,得到每个File对象
    // 5.判断该File对象是否是目录
    // 如果是,递归调用
    // 如果不是,做相应的输出或者删除等功能
    // 6.调用方法
    public static void main(String[] args) {
        final String src = "./fileTest";
        File file = new File(src);
        deleteFile(file);
        //getAllFilePath(file);
    }
    private static void deleteFile(File file){
        File[] files = file.listFiles();
        if(null != files){
            for (File f : files){
                if (f.isDirectory()){
                    deleteFile(f);
                }else{
                    // 删除文件
                    f.delete();
                }
            }
        }
        // 删除目录
        file.delete();
        // java 中 非空目录 无法删除 所以放在最外面
    }

    /**
     * 查看目录中的所有文件
     * @param file 要操作的目录
     */
    private static void getAllFilePath(File file){
        File[] files = file.listFiles();
        if(null != files){
            for (File f : files){
                if (f.isDirectory()){
                    getAllFilePath(f);// 递归
                    System.out.println(f.getAbsolutePath());
                }else {
                    System.out.println(f.getAbsolutePath());
                    //System.out.println(f.getName());
                }
            }
        }
    }
}
