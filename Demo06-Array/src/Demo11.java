import java.util.Random;

public class Demo11 {
    public static void main(String[] args) {
        Random ran = new  Random();
        int[] arr =  new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }
        System.out.println("\n============");
        System.out.println("降序排序之后的值");
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] < arr[j + 1]) {
                    arr[j] ^= arr[j + 1];
                    arr[j + 1] ^= arr[j];
                    arr[j] ^= arr[j + 1];
                }
            }
            }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }
        }
    }

