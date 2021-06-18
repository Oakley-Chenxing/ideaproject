public class Demo10 {
    public static void main(String[] args) {
        // 一个三位数数个位的立方 加 十位的立方 加 百位的立方 等于 这个数本身
        for (int i = 100; i <1000 ; i++) {
            int g = i % 10;
            int s = i/10%10;
            int b = i/100;
            if (g*g*g + s*s*s + b*b*b == i)
                System.out.println(i);
        }
    }
}
