package com.chenxing.Demo06;

/**
 * @ClassName KeyBoard
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public interface KeyBoard extends USB{
    @Override
    default void on() {
        System.out.println("The Keyboard device be disconnected!");
    }

    @Override
    default void off() {
        System.out.println("The Keyboard device be disconnected!");
    }

    default void inputting(){
        System.out.println("The keyboard is inputting!");
    }
}
