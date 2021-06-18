package com.chenxing.Demo02;

/**
 * @ClassName Zi
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Zi extends Fu{
    public String name;
    public int age;
// 构造方法
    public Zi() {
    }

    public Zi(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Zi(String name, int age, String name1, int age1) {
        super(name, age);
        this.name = name1;
        this.age = age1;
    }
// 相当于重写
    public void eat(){
        // 父类用 super
        // 子类用 this
        System.out.println("阿瓦达索命！");
        System.out.println(this.age + "的儿子" + this.name +"正在吃");
        super.eat(); // 子类调用父类的对象 直接使用super 调用
        //System.out.println(super.age + "的父亲" + super.name +"正在吃");
        //System.out.println("MonName =" + super.MomName);
    }
    public void ziMethod(){
        // super.eat();
        this.eat(); // 调用自己类当中的eat() 方法
    }
}
