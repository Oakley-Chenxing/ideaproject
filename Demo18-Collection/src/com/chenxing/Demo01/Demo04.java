package com.chenxing.Demo01;

import java.util.ArrayList;

/**
 * @ClassName Demo04
 * @Description: TODO 集合存储学生类对象 并 遍历
 * @Author: lichenxingbeijing@163.com
 */
public class Demo04 {
    public static void main(String[] args) {
        ArrayList<Student> stulist = new ArrayList<>();

        initStuList(stulist);
        showStuList(stulist);
        System.out.println("===================");
        showStuList1(stulist);
//        System.out.println(stulist);
    }

    /**
     * 利用 增强for 来遍历输出数组内容
     * @param stulist
     */
    private static void showStuList1(ArrayList<Student> stulist) {
        for(Student stu : stulist){
            System.out.printf("%-8s%-8s%-8d\n",stu.getName(),stu.getSex(),stu.getAge());
        }
    }

    /**
     * 遍历数组并输出学生信息
     * @param stulist
     */
    private static void showStuList(ArrayList<Student> stulist) {
        for (int i = 0; i < stulist.size(); i++) {
            System.out.printf("%-8s%-8s%-8d\n",stulist.get(i).getName(), stulist.get(i).getSex(),stulist.get(i).getAge());
        }
    }

    /**
     * 初始化学生类对象 并赋值
     * @param stulist
     */
    private static void initStuList(ArrayList<Student> stulist) {
        stulist.add(new Student("Andy","male",19));
        stulist.add(new Student("Jim","male",20));
        stulist.add(new Student("Oakley","male",21));
    }
}
