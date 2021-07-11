package com.chenxing.Demo02;

import java.util.TreeSet;

/**
 * @ClassName Demo03
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo02 {
    public static void main(String[] args) {
        TreeSet<Student> stuSet = new TreeSet<>();

        stuSet.add(new Student("Andy",58));
        stuSet.add(new Student("Ella",18));
        stuSet.add(new Student("Frank",44));
        stuSet.add(new Student("Griwank",22));
        stuSet.add(new Student("Holly",18));

       // Exception in thread "main" java.lang.ClassCastException: com.chenxing.Demo02.Student cannot be cast to java.lang.Comparable
        // System.out.println(stuSet);

        for(Student student:stuSet){
            System.out.println(student);
        }

    }
}
