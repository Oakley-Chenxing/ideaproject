package com.chenxing.Demo07;

/**
 * @ClassName ListNode
 * @Description: TODO 节点类
 * @Author: lichenxingbeijing@163.com
 */
public class ListNode {
    int val; // 数据域
    ListNode next = null; // 指针域 默认为 null

    /**
     * 带参构造方法 仅对数据域进行初始化
     * @param val
     */
    public ListNode(int val){
        this.val = val;
    }
}
