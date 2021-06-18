import java.util.Random;

public class Demo04 {
    public static void main(String[] args) {
        // 找最值
       Random ran = new Random();
       int[] arr = new  int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(100);

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");

        }
        System.out.println("\n=============");

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            //if (arr[i] > max)
              //  max = arr[i];
            //max = arr[i] > max ? arr[i] : max;
             max = Math.max(arr[i],max);
        }
        System.out.println(max);
    }
}
