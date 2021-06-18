package com.chenxing.Demo05;

/**
 * @ClassName Mouse
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Mouse implements USB{
    @Override
    public void on() {
        System.out.println("The USB device be connected!");
    }

    @Override
    public void off() {
        System.out.println("The USB device be diaconnected!");
    }

    public void leftClick(){
        System.out.println("The mouse can be leftclicked!");
    }
    public void rightClick(){
        System.out.println("The mouse can be rightclicked!");
    }
    public void doubleClick(){
        System.out.println("The mouse can be doubleclicked!");
    }
}
