package com.chenxing.demo07;

import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName Game
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Game {
    public static void main(String[] args) {
        Random ran = new Random();
        Player player01 = new Player("computer", ran.nextInt(3)+1);// 0-1-2
        System.out.println("Please input your result(1-石头, 2-剪刀, 3-布)");
        Scanner scanner = new Scanner(System.in);
        int res;
        res = scanner.nextInt();
        Player player02 = new Player("Oakley",res);
        Judge judge = new Judge(player01,player02);
        judge.shotGameRes();

    }
}
