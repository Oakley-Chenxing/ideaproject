import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        System.out.println("Please input a start number!");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int []arr = new int[10];
        Random ran = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr [i] = ran. nextInt(100);
        }
        System.out.println("逆序前");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n================");

        // 交换次数： 数组长度/ 2 取整
        for (int i = 0; i < arr.length/2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i ] = t ;
        }

        System.out.println("逆序后");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
