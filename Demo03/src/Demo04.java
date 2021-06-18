import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        System.out.println("please input year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        // 判断是不是闰年
        // 能被4整除 并且 不能被 100 整除的年份， 或者 能被400整除的年份是闰年
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + "是 闰年!");
        }
        else{
            System.out.println(year + "不是 闰年!");
        }

    }
}
