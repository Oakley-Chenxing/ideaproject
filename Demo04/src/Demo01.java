import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println("Please input a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
                default:
                    System.out.println("please input right number!");
        }

    }
}
