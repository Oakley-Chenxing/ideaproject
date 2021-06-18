package com.chenxing.Demo04;

/**
 * @ClassName Demo04
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo04 {
    private String strOuter = "There is the private vary in outer class !";
    // 外部类中的私有成员变量
    // 被 局部变量覆盖
    // 外部类的成员方法
    public void outerMethod (){
        // 定义局部变量（重名）
        String strOuter = "There is the part vary in outerMethod!";
        // 定义局部内部类 无修饰符
        class Inner{
            private void show(){
                System.out.println("There is part inner class -- show!");
                System.out.println(strOuter);// 局部内部类调用局部成员变量
            }
        }
        Inner i = new Inner();
        i.show();
        // 局部方法中 初始化内部类
    }

}
