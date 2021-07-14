package com.chenxing.Demo06;

import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * @ClassName Demo04
 * @Description: TODO 可变长参数的使用
 * @Author: lichenxingbeijing@163.com
 */
public class Demo04 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        // 会报错 不允许进行添加或者删除 即一切更改集合中元素长度的操作
        // list.add(1,2,3,4)
        //list.remove(3)
        list.set(3,5);
        System.out.println(list);
    }
    
}
