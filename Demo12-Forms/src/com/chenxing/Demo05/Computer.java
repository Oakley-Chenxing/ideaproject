package com.chenxing.Demo05;

/**
 * @ClassName Computer
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Computer {
    public void open(){
        System.out.println("The computer is open!");
    }
    public void close(){
        System.out.println("The computer is closed!");
    }
    public void useDevice(USB dev){
        dev.on();

        if (dev instanceof Mouse){
            ((Mouse)dev).leftClick();
            ((Mouse)dev).doubleClick();
            ((Mouse)dev).rightClick();
        }else if (dev instanceof  KeyBoard){
            ((KeyBoard)dev).inputting();
        }
        dev.off();
    }
}
