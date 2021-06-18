/*
    00000000*
    0000000***
    000000*****
 */
public class Demo17 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2*i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
