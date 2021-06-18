package com.chenxing.Demo07;

/**
 * @ClassName Chenxing
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Chenxing {
    private String job;
    // 构造方法

    public Chenxing(String job) {
        this.job = job;
    }
    // set get

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    // 如果出现方法重名，优先调用 父类的 方法
    public  void job(){
        System.out.println("There is a job in Chenxing group");
    }
}
