package com.chenxing.Demo01;

/**
 * @ClassName DemoTest011
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class DemoTest011 {
    // 外部类
    // 外部类 私有成员
    private String strOuter = "There is the outer private vary!";
    private void methodOuter(){
        System.out.println("There is the outer private method!");
    }
    // 内部类
    public  class InnerClass{
        public String strInner = "There is the inner public vary!";
        public void methodInner(){
            System.out.println("There is the inner public method!");
        }
        // 内部类 调用 外部类的方法 和 成员变量
        // 内部类 可以直接访问外部类的成员，包括私有成员
        public void runOuterClass(){
            System.out.println(strOuter);
            methodOuter();
        }
    }
    // 外部类
    // 提前实例化 内部类对象
    private void runInnerClass(){
        InnerClass i = new InnerClass();// 外部类 实例化内部类
        // 外部类要访问内部类的成员，必须要创建对象
        System.out.println(i.strInner);
        i.methodInner();
        //i.runOuterClass();
    }
    public static void main(String[] args) {
        DemoTest011 de011 = new DemoTest011(); // 实例化外部类对象
        System.out.println(de011.strOuter);
        de011.methodOuter();
        System.out.println("========================================");
        de011.runInnerClass(); // 通过调用外部类的方法 来进一步调用内部类的成员和方法



    }
}
