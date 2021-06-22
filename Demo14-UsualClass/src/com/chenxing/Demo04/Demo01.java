package com.chenxing.Demo04;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName Demo01
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Arrays.fill(arr,9);// 初始化数组（填充）
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n===================");

        int[] arr1 = new int[10];
        Random ran = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = ran.nextInt(100);
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] +" ");
        }
        System.out.println();
        Arrays.sort(arr1); // 默认排序方法 升序
        String arr2 = Arrays.toString(arr1); // 将数组转换为字符串 便于输出
        System.out.println(arr2);

    }
}
