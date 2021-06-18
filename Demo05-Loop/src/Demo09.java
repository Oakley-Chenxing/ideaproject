public class Demo09 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0)
                sum += i;
        }
        System.out.println("1 " + sum);
        System.out.println("==========");

        int sum01 = 0;
        for (int i = 0; i <=100 ; i++) {
            if(i % 2 == 1)
                continue;
                sum01 +=i;
        }
        System.out.println("2 " + sum01);
        System.out.println("=========");

        int sum02 = 0;
        int n = 0;
        while(n <= 100){
            if(n % 2 == 0)
            sum02 += n;
            n++;
        }
        System.out.println("3 " + sum02);
        System.out.println("==========");

        int sum03 = 0;
        int nn = 0;
        while(nn<=100){
            if (nn % 2 == 1){
                nn++;
                continue;
            }
            sum03 +=nn;
            nn++;
        }
        System.out.println("4 " + sum03);
        System.out.println("=========");

        int sum04 = 0;
        int m = 0;
        do{
            if (m%2 == 0){
                sum04 += m;
            }
            m++;
        } while (m <= 100);
        System.out.println("5 " + sum04);
        System.out.println("=========");

        int sum05 = 0;
        int mm = 0;
        do{
            if (mm%2 == 1){
                mm++;
                continue;
            }
            sum05 += mm;
            mm++;
        }while (mm <= 100);
        System.out.println("6 " + sum05);
    }
}
