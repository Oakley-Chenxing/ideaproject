package com.chenxing.Demo05;

/**
 * @ClassName ProgrammerTeacherImp
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class ProgrammerTeacherImp implements ProgrammerTeacher{
    private String name;

    public ProgrammerTeacherImp(String name) {
        this.name = name;
    }

    @Override
    public void teacher() {
        System.out.println(this.name + " I can teach!");
    }

    @Override
    public void editCode() {
        System.out.println(this.name + " I can code!");
    }
}
