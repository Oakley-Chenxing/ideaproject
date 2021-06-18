public class Demo16 {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <=9-i-1 ; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }
    }
}
