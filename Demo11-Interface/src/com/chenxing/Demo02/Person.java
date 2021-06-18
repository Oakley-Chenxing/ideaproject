package com.chenxing.Demo02;

/**
 * @ClassName Person
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public abstract class Person implements Animial {
    //如果实现类中没有重写接口中所有的抽象方法，那么这个类一定是个抽象类
    // alt + enter 'make person abstract'
    public abstract void methodAbs();
    // 在抽象类中实现的抽象方法
}
