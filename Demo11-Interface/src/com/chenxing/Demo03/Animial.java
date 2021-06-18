package com.chenxing.Demo03;

/**
 * @ClassName Animial
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public interface Animial {
    String TYPE= "Animial";

    void eat();
    void sport();
    // 接口中的默认方法
    // 接口中的默认方法是需要写方法体的
    // 针对接口功能的升级，通常可以使用默认方法来实现
    default void showMe(){
        System.out.println("There is the default method " + TYPE);
    }
}
