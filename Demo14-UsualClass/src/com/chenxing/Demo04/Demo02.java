package com.chenxing.Demo04;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName Demo02
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo02 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,0};
        Arrays.sort(arr); // 自然规则排序
        System.out.println(Arrays.toString(arr));// 转换成字符串输出
        System.out.println("============================================");

        Integer[] arr1 = {7,8,9,4,5,6};
        // 自定义规则排序
        Arrays.sort(arr1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // return 0; // 0 表示 正序 - 大的放后面
                // return 9527; // 大于 0 表示 相等 - 不变，顺着放就可以
                // return -1314; // 小于0 逆序 - 小的放后面
                // return = - o2; // 升序
                return o2 - o1; // 降序
            }
        });
        System.out.println(Arrays.toString(arr1));
    }
}