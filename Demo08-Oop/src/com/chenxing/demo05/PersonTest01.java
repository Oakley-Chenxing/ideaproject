package com.chenxing.demo05;

public class PersonTest01 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("oakley");
        System.out.println("p.name= " + p.getName());
        // 通过 公有成员方法 间接访问私有成员并赋值
        p.setAge(-17);
        System.out.println("p. age= " + p.getAge());
        System.out.println("===========================");
         p.pubMethod();
    }
}
