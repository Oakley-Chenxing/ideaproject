package com.chenxing.demo07;

/**
 * @ClassName Judge
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Judge {
    private Player player01;
    private Player player02;
    // 构造方法 得到两个对象


    public Judge() {
    }

    public Judge(Player player01, Player player02) {
        this.player01 = player01;
        this.player02 = player02;
    }

    /**
     * 判断算法
     * 1 石头
     * 2 剪刀
     * 3 布
     */
    public void shotGameRes(){
        // 输出他们出的内容 谁出了什么东西
        String[] r = {"石头","剪刀","布"};
        System.out.printf("%s : %s --VS-- %s : %s\n",
                player01.getName(),r[player01.getRes()-1],
                player02.getName(),r[player02.getRes()-1]);
        System.out.println("==================================");
//
//        if (player01.getRes() == player02.getRes()){
//            System.out.println("Equal! Two Winners!");
//        }else if(player01.getRes() == 1 && player02.getRes() == 2 ||
//                 player01.getRes() == 2 && player02.getRes() == 3 ||
//                 player01.getRes() == 3 && player02.getRes() == 1){
//            System.out.println(player01.getName() +" is winner!");
//        }else {
//            System.out.println(player02.getName() +" is winner!");
//        }

        //   1-2-3-1
        switch ((player01.getRes()- player02.getRes() +3)%3){
            case 0:
                System.out.println("Two Winner!");
                break;
                case 1:
                    System.out.println(player02.getName() + " is Winner!");
                    break;
            case 2:
                System.out.println(player01.getName() + " is Winner!");
                break;

        }
    }


}
