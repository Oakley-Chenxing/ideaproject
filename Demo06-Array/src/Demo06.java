import java.util.Random;
import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        Random ran = new Random();
        int [] arr= new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran. nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n=============");
        System.out.println("please the num your want find!");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int num = new Scanner(System,in).nextInt();
        int i;
        for ( i = 0; i <arr.length ; i++) {
            if(num == arr[i])
                break;
        }
        if (!(i < arr.length)){
            System.out.println("not exit!");
            System.exit(0);
        }
        System.out.println(i+1);


    }
}
