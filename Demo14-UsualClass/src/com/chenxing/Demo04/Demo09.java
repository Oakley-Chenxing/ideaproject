package com.chenxing.Demo04;

import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName Demo09
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo09 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+ 1 ;
        int date = cal.get(Calendar.DAY_OF_MONTH);
        System.out.printf("%d-%d-%d\n", year,month,date);
        // add 方法
        Calendar cal1 = Calendar.getInstance();
        cal1.add(Calendar.YEAR,1);
        cal1.add(Calendar.MONTH,1);
        cal1.add(Calendar.DAY_OF_MONTH,1);
        int year1 = cal1.get(Calendar.YEAR);
        int month1 = cal1.get(Calendar.MONTH)+ 1 ;
        int date1 = cal1.get(Calendar.DAY_OF_MONTH);
        System.out.printf("%d-%d-%d", year1,month1,date1);
        // setTime 方法
        Calendar cal2 = Calendar.getInstance();
        //cal2.setTime(new Date());
        cal2.set(2088,11,5);
        System.out.println();
        int year2 = cal2.get(Calendar.YEAR);
        int month2 = cal2.get(Calendar.MONTH)+ 1 ;
        int date2 = cal2.get(Calendar.DAY_OF_MONTH);
        System.out.printf("%d-%d-%d\n", year2,month2,date2);


    }
}
