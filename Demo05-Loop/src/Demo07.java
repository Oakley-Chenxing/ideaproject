public class Demo07 {
    public static void main(String[] args) {
        int m=0;
        while (m <=10){
            if (m%2 == 1){
                m++;
                continue;
            }
            System.out.print(m + "\t");
            m++;
        }
    }
}
