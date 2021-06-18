package com.chenxing.Demo03;

/**
 * @ClassName Zi
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Zi extends Fu{
    // 同包子类
    public void method(){
        Fu fu = new Fu();
        System.out.println(fu.varPub);
        System.out.println(fu.varPro);
        System.out.println(fu.varDef);
        System.out.println(this.varPub);
        System.out.println("Hi there is zi 类");
    }
}
