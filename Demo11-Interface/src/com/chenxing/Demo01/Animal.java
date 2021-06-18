package com.chenxing.Demo01;

/**
 * @ClassName Animal
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public interface Animal {
    public static  final String TYPE = "Animal";
    // 灰色部分为 默认的 可省略
    public abstract void eat();
    void sport();
    void sleep();
}
