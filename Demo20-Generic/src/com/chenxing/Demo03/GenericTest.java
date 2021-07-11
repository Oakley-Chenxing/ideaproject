package com.chenxing.Demo03;

/**
 * @ClassName GenericTest
 * @Description: TODO 利用泛型类来实现 但是实现类还是复杂
 * @Author: lichenxingbeijing@163.com
 */
public class GenericTest {
    public static void main(String[] args) {

        Generic<String> strG = new Generic<>();
        strG.show("27149 Hello!");

        Generic<Integer> intG = new Generic<>();
        intG.show(27149);

    }
}
