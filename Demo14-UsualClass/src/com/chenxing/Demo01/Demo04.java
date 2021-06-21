package com.chenxing.Demo01;

/**
 * @ClassName Demo04
 * @Description: TODO
 * 装箱： 把基本类型 转换为 对应的包装类类型
 * 拆箱： 把包装类类型 转换为 对应的基本数据类型
 * @Author: lichenxingbeijing@163.com
 */
public class Demo04 {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(27149); // 手动装箱
        System.out.println(i1);
        Integer i2 = 27149;// 自动装箱 jdk > 1.5
        System.out.println(i2);
        System.out.println("=======================");
        int i = i1.intValue();// 手动拆箱
        i += 1;
        System.out.println("i + 1 =" + i);
        i2 += 27149; // 自动拆箱 + 自动封箱
        //i2 = i2.intValue() + 27149;
        // 左边 计算结果再自动封箱 右边 自动拆箱 再做相加
        System.out.println(i2);

        Integer i3 = null;
        if (i3 != null)
        i3 += 520;// NullPointerException 报错 空指针异常 解决方法
        System.out.println(i3);
    }
}
