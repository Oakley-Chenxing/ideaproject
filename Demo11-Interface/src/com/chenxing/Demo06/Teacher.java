package com.chenxing.Demo06;

/**
 * @ClassName Teacher
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public interface Teacher {
    void teacher();
    default void job(){
        System.out.println("The teacher can teach!");
    }
}
