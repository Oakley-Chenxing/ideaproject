package com.chenxing.Demo08;

/**
 * @ClassName C
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class C extends B{
    @Override
    public void method() {
        super.method();
    }

    public C(int y) {
        super(y);
    }
// 用final修饰的方法不能被重写
    //@Override
//    public void yyds() {
//        super.yyds();
//    }
}
