import java.util.Scanner;
public class Hello03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a num");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("O");
        }
        else{
            System.out.println("J");
        }
    }
}
