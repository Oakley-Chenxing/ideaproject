import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        System.out.println("please input your grade");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        /*
        if (grade>100&&grade<0){
            sout("Error");
            system.exit(status:0);
        }
         */
        int a = 0;
        a = grade / 10;
        switch(a){
            case 10 :
                System.out.println("A");
                break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 4:
                System.out.println("E");
                break;
            case 3:
                System.out.println("E");
                break;
            case 2:
                System.out.println("E");
            case 1:
                System.out.println("E");
                break;
            case 0:
                System.out.println("E");
                break;
                default:
                    System.out.println("Error");

        }
    }
}
