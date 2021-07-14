package com.chenxing.Demo06;

/**
 * @ClassName Demo03
 * @Description: TODO 可变长参数
 * @Author: lichenxingbeijing@163.com
 */
public class Demo03 {
    public static void main(String[] args) {
        System.out.println(mySum(1,2,3));
        int[]arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(mySum(arr));
        int[]arr1 = {10,9};
        System.out.println(mySub(arr1));
    }

    /**
     * 形参为数组只能接收数组作为参数
     * @param a
     * @return
     */
    private static int mySub(int[]a) {
        int sub =0;
        for (int i = 0; i < a.length; i++) {
            sub-=i;
        }
        return sub;
    }

    /**
     * 可变长参数可以接受任意个数发同类型数据，也可以接受同类型数组。可变长参数一定要放在最后
     * @param a 数组（可变长参数格式）
     * @return 结果
     */
    private static int mySum(int ...a) {
        int sum = 0;
        for (int i = 0; i <= a.length; i++) {
            sum+=i;
        }
        return sum;
    }
}
