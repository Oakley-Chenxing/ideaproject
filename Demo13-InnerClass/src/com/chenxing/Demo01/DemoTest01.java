package com.chenxing.Demo01;

/**
 * @ClassName DemoTest01
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class DemoTest01 {
    // 外部类
    // 外部类 私有成员
    private String strOuter = "There is the outer private vary!";
    private void methodOuter(){
        System.out.println("There is the outer private method!");
    }
    // 内部类
    public  static class InnerClass{
        public String strInner = "There is the inner public vary!";
        public void methodInner(){
            System.out.println("There is the inner public method!");
        }
    }
    public static void main(String[] args) {
        // InnerClass i = new InnerClass(); 会报错 需要static 类型的类 所以要么实例化 要么加上static
        InnerClass i = new InnerClass();
        System.out.println(i.strInner);
        i.methodInner();
        // DemoTest011 演示 如何不添加 static 来调用 内部类成员变量 和 方法
    }

}

