import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) {
        int[]arr = new int[10];
        for (int i = 0; i <arr.length-1 ; i++) {
            arr[i] = i+1;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease input a number!");
        int num = sc.nextInt();
        int place = 0;
        for (place = 0; place < arr.length-1; place++) {
            if (num < arr[place])
                break;
        }//找到了退出循环，place存储的是应该插入的位置
        //for (int i = arr[place]; place <arr.length ; place++) {
         //   i=arr[place];
           // arr[place]= num;
            //num = i;
        //}
        for (int i = arr.length - 2; i >= place ; i--) {
            arr[i + 1]=arr[i];
        }
        arr[place] = num;

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
