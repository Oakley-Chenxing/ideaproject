package com.chenxing.Demo08;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName Demo01
 * @Description: TODO List 集合的遍历形式
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<Student> stuList = new ArrayList<>();

        stuList.add(new Student("Andy",15));
        stuList.add(new Student("Bill",15));
        stuList.add(new Student("Cat",15));
        stuList.add(new Student("Dom",15));
//        普通循环 万能的实现遍历
//        for (int i = 0; i < stuList.size(); i++) {
//            System.out.println(stuList.get(i).getName()+", "+stuList.get(i).getAge());
//        }

        // 增强 for
//        for(Student stu : stuList){
//            System.out.println(stu.getName()+", "+ stu.getAge());
//        }

        // 迭代器实现 循环遍历
        Iterator<Student> it = stuList.iterator();
        while(it.hasNext()){
            Student stu = it.next();
            System.out.println(stu.getName()+", "+ stu.getAge());
        }



    }
}
