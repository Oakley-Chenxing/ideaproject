package com.chenxing.Demo01;

import java.util.HashSet;

/**
 * @ClassName Demo05
 * @Description: TODO重写HashCode 和 equals 方法
 * @Author: lichenxingbeijing@163.com
 */
public class Demo05 {
    public static void main(String[] args) {
        HashSet<Student> stuSet = new HashSet<>();
        stuSet.add(new Student("Andy",18));
        stuSet.add(new Student("Bill",18));
        stuSet.add(new Student("Cat",18));
        stuSet.add(new Student("Donny",18));
        stuSet.add(new Student("Andy",18));

        // 遍历
        for(Student stu:stuSet){
            System.out.println(stu);
        }
    }
}
