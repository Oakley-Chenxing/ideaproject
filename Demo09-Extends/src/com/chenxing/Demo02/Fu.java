package com.chenxing.Demo02;

/**
 * @ClassName Fu
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Fu {
    public String name;
    public int age;
    public String MomName;
    // 构造方法

    public Fu() {
    }

    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println(this.age +"岁老父亲" + this.name +"正在吃 ");
    }
}
