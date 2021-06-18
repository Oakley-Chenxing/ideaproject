public class Demo06 {
    public static void main(String[] args) {
        int n = 1;
        do{
            if(n%2!=0){
                n++;
                continue;
            }
            System.out.print(n + "\t");
            n++;
        }
        while(n<=10);
    }
}
