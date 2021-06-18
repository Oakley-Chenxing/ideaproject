package com.chenxing.Demo05;

/**
 * @ClassName Running
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Running {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.open();
        computer.useDevice(new Mouse());
        System.out.println("====================");
        computer.useDevice(new KeyBoard());
        computer.close();
    }
}
