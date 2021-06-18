package com.chenxing.Demo04;

/**
 * @ClassName Mouse
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Mouse extends USB{
    // 重写方法
    @Override
    public void on() {
        System.out.println("The USB device be connected!");
    }

    @Override
    public void off() {
        System.out.println("The USB device be disconnected!");
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
