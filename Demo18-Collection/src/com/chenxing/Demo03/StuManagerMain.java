package com.chenxing.Demo03;

import java.util.ArrayList;

/**
 * @ClassName StuManagerMain
 * @Description: TODO 主类 测试类
 * @Author: lichenxingbeijing@163.com
 */
public class StuManagerMain {
    public static StuController sc = new StuController(); // 静态方法 调用静态成员
    public static void main(String[] args) {
        // 初始化测试数据
//        ArrayList<Student> stuList = new ArrayList<>();  转移到Global中
        // 调用 Global 中测试数据初始化方法来初始化 学生信息集合
        Global.initStulist();// 通过类名调用静态方法
//        System.out.println(stuList);
        // 输出欢迎界面
        // 让用户选择要操作的功能 获取到功能对应的序号
//        int a = StuPage.welcome();
        // 实例化控制器对象 让 StuController 来处理 a
//        StuController sc = new StuController(); 转移到方法外 作为静态成员
//        sc.action(a);
        // 在一个死循环中做程序的操作功能
        while (true){
            int a = StuPage.welcome();
            sc.action(a);
        }



    }
}
