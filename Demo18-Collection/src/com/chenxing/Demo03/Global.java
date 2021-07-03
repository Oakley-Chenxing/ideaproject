package com.chenxing.Demo03;

import java.util.ArrayList;

/**
 * @ClassName Global
 * @Description: TODO 全局类
 * @Author: lichenxingbeijing@163.com
 */
public class Global {
    public static int StuID=1;

    private Global(){} // 构造方法私有化
    public static ArrayList<Student> stuList = new ArrayList<>();
    // 实例化 ArrayList 对象 相当于数据库当中的表
    public static void initStulist() { // 删去了 方法中的参数
        stuList.add(new Student(StuID++,"Oakley","male",15,100));
        stuList.add(new Student(StuID++,"Andy","male",19,100));
        stuList.add(new Student(StuID++,"Maya","female",19,100));
        stuList.add(new Student(StuID++,"Umi","female",19,100));
        stuList.add(new Student(StuID++,"Lucy","female",19,100));
    }
}
