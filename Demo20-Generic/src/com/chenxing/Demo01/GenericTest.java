package com.chenxing.Demo01;

/**
 * @ClassName GenericTest
 * @Description: TODO 泛型类测试类
 * @Author: lichenxingbeijing@163.com
 */
public class GenericTest {
    public static void main(String[] args) {
        Generic<String> strG = new Generic<>();
        strG.setT("27149 Hello!");
        String str = strG.getT();
        System.out.println(str);

        Generic<Integer> intG = new Generic<>();
        intG.setT(27149);
        int intT = intG.getT();
        System.out.println(intT + 1);

        Generic<Student> stuG = new Generic<>();
        stuG.setT(new Student("Nick",20));
        Student stu = stuG.getT();
        System.out.println(stu);


    }
}
