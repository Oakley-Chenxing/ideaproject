package com.chenxing.Demo02;

import java.util.ArrayList;

/**
 * @ClassName StuManagerMain
 * @Description: TODO 主类 测试类
 * @Author: lichenxingbeijing@163.com
 */
public class StuManagerMain {
    private static StuController sc = new StuController();
    public static void main(String[] args) {

        // 测试类 主方法
        // ArrayList<Student> stuList = new ArrayList<>(); 转移到Global中
        // 调用Global 类当中的测试数据初始化方法来初始化 学生数据集合
        // Global . 调用的是  静态工具
        Global.initStuList();

        // 在一个死循环中做程序的操作功能
        while(true){
            // 输出欢迎界面 让用户选择想要操作的功能 获取到功能对应的序号
            int a = StuPage.welcome();
            // 实例化控制器对象
            sc.action(a);
        }
    }
}
