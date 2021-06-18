import java.util.Arrays;
import java.util.Random;

public class Demo10 {
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
        Arrays.sort(arr); // JAVA 使用数组的工具类 当中的排序方法
        System.out.println("\n============");
        System.out.println("排序之后的值");
        for (int i = 0; i <arr.length ; i++) {
            System.out.printf(arr[i] + " ");
        }

    }
}
