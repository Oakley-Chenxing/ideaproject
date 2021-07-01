package com.chenxing.Demo02;

/**
 * @ClassName Student
 * @Description: TODO 学生类
 * @Author: lichenxingbeijing@163.com
 */
public class Student {
    private int id;
    private String name;
    private  String sex;
    private  int age;
    private float score;

    // 构造方法 （无参 + 有参 + 不带id ）

    public Student() {
    }

    public Student(int id, String name, String sex, int age, float score) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
    }

    public Student(String name, String sex, int age, float score) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
    }

    // set & get

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    // toString()


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
