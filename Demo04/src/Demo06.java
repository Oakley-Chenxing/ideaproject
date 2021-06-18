import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        System.out.println("Please input year, month, day");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        switch (month){
            case 1:
                System.out.println(year + "年"+ month + "月有 31 天！");
                break;
            case 3:
                System.out.println(year + "年"+ month + "月有 31 天！");
                break;
            case 5:
                System.out.println(year + "年"+ month + "月有 31 天！");
                break;
            case 7:
                System.out.println(year + "年"+ month + "月有 31 天！");
                break;
            case 8:
                System.out.println(year + "年"+ month + "月有 31 天！");
                break;
            case 10:
                System.out.println(year + "年"+ month + "月有 31 天！");
                break;
            case 12:
                System.out.println(year + "年"+ month + "月有 31 天！");
                break;
            case 4:
                System.out.println(year + "年"+ month + "月有 30 天！");
                break;
            case 6:
                System.out.println(year + "年"+ month + "月有 30 天！");
                break;
            case 9:
                System.out.println(year + "年"+ month + "月有 30 天！");
                break;
            case 11:
                System.out.println(year + "年"+ month + "月有 30 天！");
            case 2:
                // 判断是不是闰年
                // 能被4整除 并且 不能被 100 整除的年份， 或者 能被400整除的年份是闰年
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
                    System.out.println(year + "年" + month + "月有 29 天！");
                }else {
                    System.out.println(year + "年" + month + "月有 28 天！");
                }
                break;
                default:
                    System.out.println("wrong month input!");

        }
    }
}
