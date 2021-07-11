package com.chenxing.Demo08;

import java.util.Scanner;

/**
 * @ClassName AddDataToArray
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class AddDataToArray {
    public static void main(String[] args) {
        // 定义一个数组 长度为10
        int[]arr = new int[10];
        // 遍历数组 数组的内容设置为 0，1，2，3，4，5，6，7，8，9
        for (int i = 0; i <arr.length-1 ; i++) {
            arr[i] = i;
        }
        // 遍历数组 将数组输出
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        // 通过 Scanner 类 输入一个 int　型　的数字
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease input a number!");
        int num = sc.nextInt();
        // 定义一个　变量　初始值为０　用来指向要添加的地方
        int place = 0;
        // 利用　ｆｏｒ　循环　找到　ｐｌａｃｅ　应该放的地方
        for (place = 0; place < arr.length-1; place++) {
            if (num < arr[place])
                break;
        }//找到了退出循环，place存储的是应该插入的位置
        for (int i = arr[place]; place <arr.length ; place++) {
            i=arr[place];
            arr[place]= num;
            num = i;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }


        System.out.println(num);
    }
}
