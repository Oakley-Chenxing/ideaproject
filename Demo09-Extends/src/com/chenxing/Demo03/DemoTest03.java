package com.chenxing.Demo03;

/**
 * @ClassName DemoTest03
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class DemoTest03 {
    public static void main(String[] args) {
        // 除了 private 其他三种权限 在当前包内 的不同类中可以访问
        Fu fu = new Fu();
        System.out.println(fu.varPub);
        System.out.println(fu.varPro);
        System.out.println(fu.varDef);
        System.out.println("==============================");
        // 除了 private 其他三种权限 在当前包内 子类中可以访问
        Zi zi = new Zi();
//        System.out.println(zi.varDef);
//        System.out.println(zi.varPro);
//        System.out.println(zi.varPub);
        zi.method();

    }
}
