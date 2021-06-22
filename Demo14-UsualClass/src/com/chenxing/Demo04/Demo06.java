package com.chenxing.Demo04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName Demo06
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo06 {
    public static void main(String[] args) throws ParseException {
        // 使用 SimpleDateFormat 利用 Date 对象格式化输出指定的时间
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        System.out.println(sdf1);
        System.out.println("=========================================");

        SimpleDateFormat sdf2  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s1 = sdf2.format(new Date());
        System.out.println(s1);
        System.out.println("==========================================");

        SimpleDateFormat sdf0 = new SimpleDateFormat();
        System.out.println(sdf0.format(new Date()));
        System.out.println("=============================================");
        // 使用 指定的字符串时间格式，利用 SimpleDateFormat 来获取指定时间的 Date 对象
        String time = "2021-06-22 14:41:26";
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf3.parse(time); // 出现错误 抛上去
        System.out.println(parse);
    }
}
