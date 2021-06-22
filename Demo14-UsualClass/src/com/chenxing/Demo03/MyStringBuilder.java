package com.chenxing.Demo03;

/**
 * @ClassName MyStringBuilder
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class MyStringBuilder {
    private String str = " Hello";
    // 构造方法 无参 有参
    public MyStringBuilder() {
    }

    public MyStringBuilder(String str) {
        this.str = str;
    }

    public MyStringBuilder append(String str){
        this.str += str;
        return this;
    }

    public void PrintStr(){
        System.out.println(str);
    }
}
