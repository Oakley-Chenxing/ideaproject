import java.util.Random;
/*
    冒泡排序法 升序
    22 58 72 10 90 19 91 10 75 11 原始数据格式
    22 58 10 72 19 90 10 75 11 91 第一次比较 比9次
    22 10 58 19 72 10 75 11 90    第二次比较 比8次
    10 22 19 58 10 72 11 75       第三次比较 比7次
    10 19 22 10 58 11 72          第四次比较   6
    10 19 10 22 11 58               五        5
    10 10 19 11 22                  六        4
    10 10 11 19                     七        3
    10 10 11                        八        2
    10 10                           九        1
    10                            数组长度-1  数组长度-1-外循环次数
*/
public class Demo09 {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] arr = new int[10];
        // 数组的初始化
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(100);
        }
        // 排序之前的原始数据存储格式
        for (int i = 0; i <arr.length ; i++) {
            System.out.printf(arr[i] +" ");
        }
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
              // 比较当前位置的成员是否大于后面的，如果是则交换
              if (arr[j]> arr[j+1]){
                  // 交换算法
                  // a ^= b
                  // b ^= a
                  // a ^= b
                  arr[j] ^= arr[j + 1];
                  arr[j + 1] ^= arr[j];
                  arr[j] ^= arr[j + 1];
              }
            }

        }
        System.out.println("\n============");
        System.out.println("排序之后的值");
        for (int i = 0; i <arr.length ; i++) {
            System.out.printf(arr[i] + " ");
        }

    }
}
