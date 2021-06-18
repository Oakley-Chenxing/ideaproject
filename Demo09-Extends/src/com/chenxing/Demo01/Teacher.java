package com.chenxing.Demo01;

/**
 * @ClassName Teacher
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Teacher extends Person{
// 教师类的特有变量
    public int jobAge;
// 无参构造
    public Teacher() {
    }
// 带参构造
    public Teacher(int jobAge) {
        this.jobAge = jobAge;
    }

    public Teacher(String name, int age, int jobAge) {
        super(name, age); // 调用父类当中的构造方法
        this.jobAge = jobAge;
    }

    public void teach(){
        System.out.println("The teacher can teach!");
    }
}
