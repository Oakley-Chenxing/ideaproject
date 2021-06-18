package com.chenxing.Demo07;

/**
 * @ClassName Tutee
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Tutee extends Chenxing implements Teacher,Programmer{
    // 加载父类
    public Tutee(String job) {
        super(job);
    }
    // 重写接口方法
    @Override
    public void editCode() {
        System.out.println(this.getJob() + " can code");
    }

    @Override
    public void teach() {
        System.out.println(this.getJob() + " can teach");
    }
    // 重写接口 默认方法
    // @Override
//    public void job() {
//        System.out.println("I am tutee of Chenxing!");
//    }
}
