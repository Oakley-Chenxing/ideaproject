import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        // 16岁办理身份证
        System.out.println("Please input your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age == 16){
            System.out.println("you should get ID card!");
        }else if(age>16){
            System.out.println("you have ID card, do not need get ID card");
        }else if(age<16){
            System.out.println("you age is not enough!");
        }
    }
}
// 考虑JS 语言 常量放在前面