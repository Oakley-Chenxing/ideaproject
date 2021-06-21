package com.chenxing.Demo02;

import java.util.Arrays;

/**
 * @ClassName Demo03
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo03 {
    public static void main(String[] args) {
//        public char charAt(int index)
//        返回给定索引位置的对应的字符
        String s1 = new String("abcdefg");
        System.out.println(s1.charAt(0));
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i)+ ". ");
        }
        System.out.println("\n======================");

//        public int compareTo(String anotherString)
//        比较字符串的大小
        String s2 = new String("abcd");
        System.out.println(s1.compareTo(s2));
        System.out.println("=========================");
        // 的返回值如果大于0说明调用者大于参数，
        // 如果小于0说明调用者小于参数，
        // 如果等于0说明调用者等于参数

//        public String concat(String str)
//        字符串连接
        System.out.println("520".concat("1314"));
        String res = "520".concat("1314");
        System.out.println(res);
        System.out.println("=========================");

//        public boolean equals(Object anObject)
//        比较字符串是否相等
        System.out.println(s1.equals(s2));
        System.out.println("=========================");

//        public byte[] getBytes()
//        返回字节数组
        byte[] b1 = "Linux".getBytes();
        //System.out.println(Arrays.toString(b1));
        for (byte b: b1){
            System.out.print(b+" ");
        }
        System.out.println("\n===========================");


//        public int indexOf(int ch)
//        查找给定字符的所在位置
        System.out.println("LinuxL".indexOf(76));
        System.out.println("LinuxL".indexOf("L"));
        System.out.println("==============================");

//        public int length()
//        返 回字符串长度
        System.out.println("abcdefg".length());
        System.out.println("==============================");

//        public String[] split(String regex)
//        拆分
        String[] s3 = "Oakley,yyds".split(",");
        for (String str: s3){
            System.out.println(str);
        }
        System.out.println("=========================");

//        substring(int beginIndex, int endIndex)
//        截取
        String s4 = "1234567890".substring(3,6);// 从索引为3开始截取，截取到6之前，不包含6索引
        System.out.println(s4);
        System.out.println("=========================");

//        public char[] toCharArray()
//        返回字符数组
        char [] chars = "abcdefg".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + ", ");
        }
        System.out.println("\n=========================");

//        trim()
//        去掉两端多余的空格
        String t1 = " Oakley ".trim();
        System.out.println("****"+t1+"****");
        System.out.println("=========================");


//        public boolean isEmpty()
//        判断是否为空串
        System.out.println("".isEmpty());
        System.out.println("Hello".isEmpty());

    }
}
