package com.chenxing.Demo06;

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
    public void editCode() {
        System.out.println(this.name + " can code");
    }

    @Override
    public void teacher() {
        System.out.println(this.name + " can teach");
    }
}
