import java.util.Random;
import java.util.Scanner;

public class Demo19 {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        int res = ran.nextInt(100);

        while (true){
            System.out.println("please input a number");
            int num = sc.nextInt();
            if (num < res){
                System.out.println("you input number is small");
            }else if (num > res){
                System.out.println("you input number is big");
            }else if (num == res){
                System.out.println("right number");
                break;
            }
        }
    }
}
