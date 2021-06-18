package com.chenxing.Demo06;

/**
 * @ClassName ProgrammerTeacher
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public interface ProgrammerTeacher extends Teacher,Programmer{
    // 用重写 或 调用的方法 解决接口default 命名冲突问题
    @Override
    default void job() {
        //Teacher.super.job();
        //Programmer.super.job();
        // 子类重写
        System.out.println("The programmer teacher can code and teach!");
    }
}
