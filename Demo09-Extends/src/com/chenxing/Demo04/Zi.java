package com.chenxing.Demo04;

import com.chenxing.Demo03.Fu;

import java.sql.SQLOutput;

/**
 * @ClassName Zi
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Zi extends Fu {
    public void method(){
        System.out.println(super.varPro);
        System.out.println(super.varPub);
        //System.out.println(super.vardef);
        // 不同包的子类 default 不能被调用
    }
}
