import java.util.Scanner;
/*
 1. 用户输入的日期是否合法进行panduan
 2. 年份小于0，月份小于1 或 大于12 日期小于1 或大于 对应月的最大天数
 3. 计算每个月的最大天数
 4. 累加 从输入月份的前一个月 开始加，再加上 当前输入的天数
 */
public class Demo07 {
    public static void main(String[] args) {
        // 用户输入年月日 输出对应日期应是该年份的 第多少天
        Scanner sc = new Scanner(System.in);
        System.out.println("please input year: ");
        int year = sc.nextInt();
        System.out.println("please input month: ");
        int month = sc.nextInt();
        System.out.println("please input day: ");
        int day = sc.nextInt();
        int sumday = 0;
        if (month > 12 || month < 1){
            System.out.println("Error month input");
            System.exit(0);
        }

        //System.out.println( year + "/"+ month + "/"+ day + " is No." + day +" day of "+ year);
        //                break;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                sumday = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                sumday = 30;
                break;
            case 2:
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
                    sumday = 29;
                }else{
                    sumday = 28;
                }
                break;
                default:
                    System.out.println("Error month!");
        }
        if (day > sumday || day < 1){
            System.out.println("Error day input");
            System.exit(0);
        }
        //2021/05/21
        int sumdate = day;
        switch(month - 1){
            case 11: sumdate += 30;
            case 10:sumdate += 31;
            case 9:sumdate += 30;
            case 8:sumdate += 31;
            case 7: sumdate += 31;
            case 6:sumdate += 30;
            case 5:sumdate += 31;
            case 4:sumdate += 30;
            case 3: sumdate += 31;
            case 2:sumdate += (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))? 29 : 28 ;
            case 1:sumdate += 31;
        }
        System.out.println( year + "/"+ month + "/"+ day + " is No." + sumdate +" day of "+ year);
    }
}
