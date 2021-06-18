package com.chenxing.Demo04;

/**
 * @ClassName Chenxing
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Chenxing implements Teacher,Programmer{
   private String name;
   // 构造方法
    public Chenxing(String name) {
        this.name = name;
    }

    // 方法重写
    @Override
    public void editCode() {
        System.out.println(this.name + " can coding!");
    }

    @Override
    public void teach() {
        System.out.println(this.name + " can teaching!");
    }
}
