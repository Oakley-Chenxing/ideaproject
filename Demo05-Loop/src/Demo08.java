

public class Demo08 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <=100 ; i++) {
                sum += i;
        }
        System.out.println(sum);
        System.out.println("==========");

        int sum2 = 0;
        int n = 0;
        while(n <= 100){
            sum2 += n;// sum2 += n++;
            n++;
        }
        System.out.println(sum2);
        System.out.println("==========");

        int sum3 = 0;
        int m = 0;
        do{
            sum3 += m;
            m++;
        }while(m <= 100);
        System.out.println(sum3);
        System.out.println("==========");

        int sum4 = 0;
        for (int i = 1; i <=100 / 2 ; i++) {
              sum4 += (1+100);

        }
        System.out.println(sum4);
    }
}
