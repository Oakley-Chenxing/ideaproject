package com.chenxing.Demo05;

/**
 * @ClassName GenericImpl
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class GenericImpl<T> implements Generic<T> {// 实现泛型接口的类应该是泛型类
    @Override
    public void show(T t) {
        System.out.println("这里是泛型的接口案例");
        System.out.println(t);
    }
}
