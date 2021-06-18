import java.util.Scanner;
public class Demo0601 {
    public static void main(String[] args) {
        System.out.println("please input a number!");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // 判断是不是100 以内的偶数
        if (num < 100) {
            if (num % 2 == 0) {
                System.out.println(num + "是100 以内的偶数");
            } else {
                System.out.println(num + "不是100 以内的偶数");
            }
            System.out.println("判断完毕");}
            else{
               if (true){
                System.out.println("不是100 以内的数");
            }
        }
    }
}
