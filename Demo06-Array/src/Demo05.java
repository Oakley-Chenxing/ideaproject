import java.util.Random;

public class Demo05 {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "\t");
        }
        System.out.println("\n=============");

        int maxadd = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxadd])
                maxadd = i;
            }
        System.out.printf("arr[%d] = %d\n", maxadd, arr[maxadd]);
        // 只会存储 第一个最大值的地址
        }
    }

