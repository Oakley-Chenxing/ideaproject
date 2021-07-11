package com.chenxing.Demo07;

/**
 * @ClassName ListNodeFunc
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class ListNodeFunc {
    public static void main(String[] args) {
        // 定义一个头节点 存储一个特殊的 自定义值
        ListNode listHead = new ListNode(-27149);
        // 创建几个节点
        ListNode ln1 = new ListNode(111);
        ListNode ln2 = new ListNode(222);
        ListNode ln3 = new ListNode(333);
        ListNode ln4 = new ListNode(444);
        // 将节点添加到链表中
        addNode(listHead,ln1);
        addNode(listHead,ln2);
        addNode(listHead,ln3);
        addNode(listHead,ln4);
        // 输出链表中的节点
        // 对链表进行遍历
        showListNode(listHead);
        System.out.println(listHead.val);
    }

    /**
     * 输出链表中的内容
     * @param listNode
     */
    private static void showListNode(ListNode listNode) {
        // 跳过头节点
        listNode =listNode.next;
        // 如果当前访问的节点不是空的，说明不是尾节点 ，那就继续遍历
        while(null != listNode){
            System.out.println(listNode.val);
            // 节点后移
            listNode=listNode.next;
        }

    }

    /**
     * 向链表中 添加节点
     * @param listNode 目标链
     * @param node 目标节点
     */
    private static void addNode(ListNode listNode,ListNode node){
        if(null == listNode){ // 判断一下 当前传进来的链 是否为空
            // 如果为链表空 则将传进来的节点 作为头节点
            // 使用参数节点作为链表的头节点
            listNode = node;
        }else{
            // 如果节点的指针域 不是空的 说明不是最后一个节点 那就循环往后找
            while(null != listNode.next){
                // 节点后移
                listNode = listNode.next;
            }
            // 当这个循环退出时 listNode 指向的就是最后一个节点
            listNode.next = node;
        }
    }
}
