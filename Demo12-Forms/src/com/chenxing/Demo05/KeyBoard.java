package com.chenxing.Demo05;

/**
 * @ClassName KeyBoard
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class KeyBoard implements USB{
    @Override
    public void on() {
        System.out.println("The keyboard be connected!");
    }

    @Override
    public void off() {
        System.out.println("The keyboard be disconnected!");
    }
    public void inputting(){
        System.out.println("Now the keyboard is inputting");
    }
}
