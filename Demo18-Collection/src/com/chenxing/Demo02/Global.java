package com.chenxing.Demo02;

import java.util.ArrayList;

/**
 * @ClassName Global
 * @Description: TODO 全局类 定义功能的方法
 * @Author: lichenxingbeijing@163.com
 */
public class Global {
    // 构造方法私有化
    private Global(){
    }
    // 实例化 ArrayList 对象 相当于数据库当中的表
    public static ArrayList<Student> stuList = new ArrayList<>();
    public static int stuID = 1;
    public static void initStuList() {
        stuList.add(new Student(stuID++,"Oakley","male",18,99));
        stuList.add(new Student(stuID++,"Alisa","female",19,100));
        stuList.add(new Student(stuID++,"Alex","male",20,97));
        stuList.add(new Student(stuID++,"Vicky","female",15,96));
        stuList.add(new Student(stuID++,"Old-six","male",17,95));
        stuList.add(new Student(stuID++,"Leo","male",17,20));
    }
}
