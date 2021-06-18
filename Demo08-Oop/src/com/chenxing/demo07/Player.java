package com.chenxing.demo07;

/**
 * @ClassName Player
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Player {
    private String name;
    private int res;
// 创建构造方法 有参 + 无参 一共四个
    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(int res) {
        this.res = res;
    }

    public Player(String name, int res) {
        this.name = name;
        // 构造方法时 就应该调用
        if(res >= 1 && res <= 3)
            this.res = res;
        else {
            System.out.println("EROOR! Game Over");
            System.exit(-1);// 默认退出码为0 自定义出拳非法返回值 -1
        }
    }
    // 设置 变量 set get 方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRes() {
        return res;
    }

    /**
     * 限制出拳结果
     * 1 石头
     * 2 剪刀
     * 3 布
     * @param res
     */
    // 没有被调用
    public void setRes(int res) {
        if(res >= 1 && res <= 3)
        this.res = res;
        else {
            System.out.println("EROOR! Game Over");
            System.exit(-1);// 默认退出码为0 自定义出拳非法返回值 -1
        }
    }

    // 查看参数内容 tostring

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", res=" + res +
                '}';
    }
}
