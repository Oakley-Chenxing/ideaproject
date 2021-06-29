package com.chenxing.Demo02;

/**
 * @ClassName Demo01
 * @Description: TODO 自定义异常测试类
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01 {
    public static void main(String[] args) {
        Student stu = new Student();
        try {
            stu.setAge(18);
        } catch (AgeException e) {
            e.printStackTrace();
        }
        System.out.println(stu.getAge());
    }
}
