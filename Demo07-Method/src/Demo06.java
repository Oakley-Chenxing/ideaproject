import java.util.Scanner;

/**
 * 凯撒日期的函数版
 * 用户输入的年月日 是对应年份的第几天
 */
public class Demo06 {
    public static void main(String[] args) {
       // int[] date = getDate();
       // System.out.print(" " + date[0] +" "+ date[1] + " " + date[2]);
        //System.out.printf("%d年%d月%d日\n",date[0],date[1],date[2]);
        //System.out.println(judgeYear(2020));
        //System.out.println(dayMonth(2020,13));
        //System.out.println(judgeInput(2000,88,998));
        int[] date;
       do {
           // 通过获取日期的放大得到数组
              date = getDate();
       }while (!judgeInput(date[0],date[1],date[2]));// 不合法 向上循环
        System.out.println("right data, go on !");
        int sum = date[2];
        for (int i = date[1]-1; i >0 ; i--) {
            sum += dayMonth(date[0],i);
        }
        System.out.printf("%d year %d month %d day is %d year N0.%d!",date[0],date[1],date[2],date[0],sum);


    }
    // 获取用户输入的日期
    // 判断日期是否合法
    // 判断平闰年
    // 判断用户输入的年份 月份 所对应的天使
    public static int[] getDate (){
        Scanner sc = new Scanner(System.in);
        int[] inputDate = new int[3];
        System.out.print("Please input year: ");
        inputDate[0] = sc.nextInt();
        System.out.print("Please input month: ");
        inputDate[1] = sc.nextInt();
        System.out.print("Please input date: ");
        inputDate[2] = sc.nextInt();
        return inputDate;
    }

    /**
     *
     * @param year
     * @return true- run nian false - ping nian
     */
    public static boolean judgeYear(int year){
     //   if ((year % 4 == 0 && year % 100 != 0)|| year % 400 ==0)
     //       return true;
     //   else
     //       return false;
        return (year % 4 == 0 && year % 100 != 0)|| year % 400 ==0;
    }

    /**
     *
     * @param year
     * @param month
     * @return the day of ,month
     */
    public static int dayMonth(int year, int month){
        int result = 0;
        switch(month){
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                result = 31;
                break;
            case 4:case 6: case 9:case 11:
                result = 30;
                break;
            case 2:
                result = judgeYear(year) ? 29:28;
                break;
                default:
                    System.out.println("please input correct month from 1~12 !");
                    System.exit(0);
        }
        return result;
    }

    /**
     *
     * @param year
     * @param month
     * @param date
     * @return true false
      */
    public static boolean judgeInput(int year, int month, int date){
        if(month < 1 || month >12) {
            System.out.println("Error Month!");
            return false;
        }
        if (date<1 || date>dayMonth(year,month)){
            System.out.println("Error Date!");
            return false;
        }
        return true;
    }

}
