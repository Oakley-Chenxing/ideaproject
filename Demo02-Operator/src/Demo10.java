import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please input");
        int a = sc.nextInt();
        System.out.println("your number" + a );
        System.out.println("gewei " + (a % 10 ));
        System.out.println("shiwei " + (a % 100/10 )); // a/10%10
        System.out.println("baiwei " + (a % 100));
    }
}
