import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int a = sc.nextInt();
        if (a % 2 == 0){
            System.out.println("是偶数");
        }
        else{
            System.out.println("是奇数");
        }
    }
}
