package com.chenxing.demo04;

/**
 * 将 person 类的对象 作为 返回值
 *
 */
public class PersonTest02 {
    public static void main(String[] args) {
        Person person = getPerson("Oakley",8);
        person.eat();
    }

    /**
     *
     * @param name
     * @param age
     * @return 对象 带有姓名和年龄的对象
     */
    public static Person getPerson(String name,int age){
        Person person = new Person();
        person.age = age;
        person.name = name;
        return  person;
    }
}
