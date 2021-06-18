package com.chenxing.Demo06;

/**
 * @ClassName Programmer
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public interface Programmer {
    void editCode();
    default void job(){
        System.out.println("The programmer can code!");
    }
}
