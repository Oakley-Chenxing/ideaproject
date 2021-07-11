package com.chenxing.Demo03;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @ClassName Demo01
 * @Description: TODO 使用匿名内部类的方式实现 TreeSet 自定义排序
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 根据年龄进行排序 年龄相等根据姓名字符串进行排序
                int res = o1.getAge()-o2.getAge();
                return 0 == res ? o1.getName().compareTo(o2.getName()):res;
            }
        });

        ts.add(new Student("Frank",18));
        ts.add(new Student("Green",18));
        ts.add(new Student("Halen",21));
        ts.add(new Student("Ice",55));
        ts.add(new Student("Jack",9));

        for(Student student:ts){
            System.out.println(student);
        }
    }
}
