package com.chenxing.Demo02;

/**
 * @ClassName DemoTest02
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class DemoTest02 {
    public static void main(String[] args) {
        Animal animal = new Cat();// 向上转型 创建一个子类对象，把他当做父类对象来使用
        // 弊端：无法调用子类特有方法
        animal.eat();
        System.out.println(animal.name);
        System.out.println("===============");
        // 向下转型：向下转型就是还原子类对象，用强制类型转换的方式实现
        //((Cat)animal).jump();
        //-   用谁 new 的就还原成谁
        //-   还原之前使用 ```对象名 instanceof 类名``` 进行判断，避免出错
        System.out.println(animal instanceof Cat);// 判断1个对象是否属于某一个类 如果是返回true
        //((Dog)animal).jump();
        // 报错 .ClassCastException 类型转换异常
        if (animal instanceof  Cat)
            ((Cat)animal).jump();
        if (animal instanceof Dog)
            ((Dog)animal).jump();
        // 在向下转型之前，先判断 转型对象 是否合法

    }
}
