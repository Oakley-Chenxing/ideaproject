package com.chenxing.Demo04;

/**
 * @ClassName Math
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo03 {
    public static void main(String[] args) {
        //返回绝对值
        System.out.println(Math.abs(-88));
        //返回大于等于参数的最小double值
        System.out.println(Math.ceil(3.14));
        System.out.println(Math.ceil(3.64));
        //返回大小等于参数的最小double值
        System.out.println(Math.floor(3.14));
        System.out.println(Math.floor(3.64));
        //返回四舍五入
        System.out.println(Math.round(3.14));
        System.out.println(Math.round(3.64));
        //返回大/小值
        System.out.println(Math.max(5, 6));
        System.out.println(Math.max(5, 6));
        //返回第一个参数的第二个参数次幂的值
        System.out.println(Math.pow(2,3));
        //返回一个0-1之间的随机值
        System.out.println(Math.random());
        // 0-100
        System.out.println((int)Math.random()*10000)  ;
        // 1-3
        System.out.println((int)(Math.random()*3000000)%3 +1) ;
    }
}
