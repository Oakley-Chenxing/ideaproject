package com.chenxing.Demo02;

/**
 * @ClassName student
 * @Description: TODO 自定义异常类
 * @Author: lichenxingbeijing@163.com
 */
public class Student {
    private int age;
// 构造方法 有参 + 无参
    public Student(int age) {
        this.age = age;
    }

    public Student() {
    }

    // set & get 方法

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {

        if (age < 0 || age >100 ){
            this.age = 18;
            throw new AgeException("年龄非法，默认值是18");
        } this.age = age;
    }
}
