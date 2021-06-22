package com.chenxing.Demo04;

import java.util.Calendar;

/**
 * @ClassName Demo08
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo08 {
    public static void main(String[] args) {
        // 获取 日历对象
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        // 输出 时间相关信息

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
    }
}
