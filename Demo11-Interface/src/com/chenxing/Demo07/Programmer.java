package com.chenxing.Demo07;

/**
 * @ClassName Programmer
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public interface Programmer {
    void editCode();
    default void job(){
        System.out.println(" can code!");
    }
}
