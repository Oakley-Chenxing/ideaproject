package com.chenxing.Demo04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName Demo07 封装时间和日期的转换方法
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo07 {
    /**
     * 将 Date 类型转换成指定格式的字符串
     * @param date 要转换的对象
     * @param format 目标格式
     * @return 转换之后的字符串
     */
    public static String dateToString(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }


    public static void main(String[] args) throws ParseException {
        System.out.println(dateToString(new Date(), "yyyy-MM-dd HH:mm:ss"));

        System.out.println(stringToDate("2021-06-11 16:34:25", "yyyy-MM-dd HH:mm:ss"));

    }

    /**
     * 将一个时间类型的字符串根据指定的格式转换成 Date 对象
     * @param str str 用来表示时间的字符串
     * @param format 字符串所对应的时间格式
     * @return 转换之后的 Date 对象
     * @throws ParseException
     */
    private static Date stringToDate(String str, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(str);

    }
}