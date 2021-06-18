public class Demo13 {
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%dx%d=%d\t", j, i, i*j);

            }
            System.out.println();
        }
    }
}
