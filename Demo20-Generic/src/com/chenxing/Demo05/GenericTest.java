package com.chenxing.Demo05;

import com.chenxing.Demo01.Student;

/**
 * @ClassName GenericTest
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class GenericTest {
    public static void main(String[] args) {
        GenericImpl<Integer> intG = new GenericImpl<Integer>();
        intG.show(27149);

        GenericImpl<String> strG = new GenericImpl<>();
        strG.show("Today is very good!");

        // 匿名内部类
        new GenericImpl<Student>(){
            public void show(Student student)
            {
                System.out.println("这里是学生的详细信息：");
                System.out.println(student);
            }
        }.show(new Student("Qual",100));

    }

}
