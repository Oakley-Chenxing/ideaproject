package com.chenxing.Demo02;

/**
 * @ClassName AgeException
 * @Description: TODO 自定义异常
 * @Author: lichenxingbeijing@163.com
 */
public class AgeException extends Exception{
// AgeException extends RuntimeException 非监测性异常
    public AgeException(){
    }
    public AgeException(String message) {
        super(message);
    }
}
