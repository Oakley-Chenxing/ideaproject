package com.chenxing.Demo03;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @ClassName Demo02
 * @Description: TODO使用匿名内部类的方式实现 TreeSet 自定义排序 lambda 版
 * @Author: lichenxingbeijing@163.com
 */
public class Demo02 {
    public static void main(String[] args) {
        // 根据年龄进行排序 年龄相等根据姓名字符串进行排序 lambda 实现
        TreeSet<Student> ts1 = new TreeSet<Student>(Comparator.comparingInt(Student::getAge).thenComparing(Student::getName));

        ts1.add(new Student("kacy",45));
        ts1.add(new Student("lily",20));
        ts1.add(new Student("Maya",18));

        for(Student student : ts1){
            System.out.println(student);
        }

    }
}
