package com.chenxing.Demo06;

import com.chenxing.Demo01.Student;

import java.util.ArrayList;

/**
 * @ClassName Demo01
 * @Description: TODO 泛型通配符
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01 {
    public static void main(String[] args) {
        // <?>泛型通配符等价于object
        ArrayList<?> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Float> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        ArrayList<Boolean> list5 = new ArrayList<>();
        ArrayList<Student> list6 = new ArrayList<>();

        // <? extends Number> 泛型的上限
        ArrayList<? extends Number> list7 = new ArrayList<>();
        ArrayList<? extends Number> list8 = new ArrayList<Integer>();
        ArrayList<? extends Number> list9 = new ArrayList<Float>();
        ArrayList<? extends Number> list10 = new ArrayList<Double>();
        // 超过泛型的上限
//        ArrayList<? extends Number> list10 = new ArrayList<String>();
//        ArrayList<? extends Number> list11 = new ArrayList<Object>();
        // 超过上线的不行

        // <? super Number> 泛型的下限
        ArrayList<? super Number> list12 =new ArrayList<Number>();
        ArrayList<? super Number> list13 =new ArrayList<Object>();
//        ArrayList<? super Number> list14 =new ArrayList<String>();
//        ArrayList<? super Number> list15 =new ArrayList<Integer>();
//        ArrayList<? super Number> list16 =new ArrayList<Float>();
//        超过下线的不行
    }
}
