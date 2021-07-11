package com.chenxing.Demo02;

/**
 * @ClassName Student
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //return 0; 0 表示相等，后面传递进来的 o 对象 存储不进去
        //return 27149; >0 表示 o 对象比当前对象大 进来的对象 放到后面
        //return -7758521; <0 表示 o 对象比当前对象小 进来的对象 放到前面
       // return this.getAge()-o.getAge(); 按照年龄进行排序
        int res = this.getAge()-o.getAge(); // 按照年龄进行排序，年龄相等 根据姓名字符串进行排序
        return 0 == res ? this.getName().compareTo(o.getName()):res;
    }


}
