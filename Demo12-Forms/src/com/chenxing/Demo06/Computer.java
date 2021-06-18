package com.chenxing.Demo06;

/**
 * @ClassName Computer
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Computer implements USB,KeyBoard,Mouse{
    public Computer() {
    }


    @Override
    public void on() {
        System.out.println("The computer is open!");
    }

    @Override
    public void off() {
        System.out.println("The computer is close!");
    }
    // 使用 USB
    public void useDevice(USB dev){
        dev.on();
        if (dev instanceof Mouse){
            ((Mouse)dev).leftClick();
            ((Mouse)dev).rightClick();
            ((Mouse)dev).doublelick();
        }else if (dev instanceof KeyBoard){
            ((KeyBoard)dev).inputting();
        }
        dev.off();
    }
}
