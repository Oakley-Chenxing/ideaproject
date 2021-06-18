package com.chenxing.Demo07;

/**
 * @ClassName Teacher
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public interface Teacher {
    void teach();
    default void job(){
        System.out.println(" can teach!");
    }
}
