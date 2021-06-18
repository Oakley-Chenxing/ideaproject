package com.chenxing.demo04;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.age = 17;
        p.name = "Oakley";

        show(p);
    }
    public static void show(Person person){ // person 调用相同的地址 与 p 一样
        person.name = "pipi";
        person.age = 20;
        person.eat();

    }
}
