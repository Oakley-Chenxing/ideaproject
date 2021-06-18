import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the first number: ");
        int num01 = sc.nextInt();
        System.out.println("Please input the Second number: ");
        int num02 = sc.nextInt();
        System.out.println("Please input the opertor type(like + - * % / ): ");
        String c = sc.next();
        switch (c){
            case "+":
                System.out.printf("%d %s %d = %d", num01, c, num02, (num01 + num02));
                break;
            case "-":
                System.out.printf("%d %s %d = %d", num01, c, num02, (num01 - num02));
                break;
            case "*":
                System.out.printf("%d %s %d = %d", num01, c, num02, (num01 * num02));
                break;
            case "/":
                if (0 == num02){ // 为什么0 写在前面？
                    System.out.println("the second number can not is 0 !");
                    break;
                }
                System.out.printf("%d %s %d = %d", num01, c, num02, (num01 / num02));
                break;
            case "%":
                if (0 == num02){ // 为什么0 写在前面？
                    System.out.println("the second number can not is 0 !");
                    break;
                }
                System.out.printf("%d %s %d = %d", num01, c, num02, (num01 % num02));
                break;
        }


    }
}
