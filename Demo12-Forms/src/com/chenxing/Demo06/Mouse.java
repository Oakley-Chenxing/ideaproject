package com.chenxing.Demo06;

/**
 * @ClassName Mouse
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public interface Mouse extends USB{

    @Override
    default void on() {
        System.out.println("The Mouse device be connected!");
    }

    @Override
    default void off() {
        System.out.println("The Mouse device be disconnected!");
    }

    default void leftClick(){
        System.out.println("The mouse can be leftclicked!");
    }
    default void rightClick(){
        System.out.println("The mouse can be rightclicked!");
    }
    default void doublelick(){
        System.out.println("The mouse can be doubleclicked!");
    }
}
