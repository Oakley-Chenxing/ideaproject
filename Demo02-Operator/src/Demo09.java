public class Demo09 {
    public static void main(String[] args) {
        // 三个数的最大值
        int a = 3, b = 4, c = 5;

        System.out.println(a > b ? (a > c ? a : c): b > c ? b : c);
    }
}
