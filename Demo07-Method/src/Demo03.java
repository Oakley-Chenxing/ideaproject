public class Demo03 {
    public static void main(String[] args) {
        printStart01(8);
    }

    /**
     * 无参无返回值，打印固定大小的星号矩形9*7
     */
    public static void printStart(){
        System.out.println("* * * * * * * * *");
        System.out.println("* * * * * * * * *");
        System.out.println("* * * * * * * * *");
        System.out.println("* * * * * * * * *");
        System.out.println("* * * * * * * * *");
        System.out.println("* * * * * * * * *");
        System.out.println("* * * * * * * * *");
        System.out.println("====================");
    }

    /**
     * 根据n 的数量 打印 n 行 n 列 的星号 组成的矩形
     * @param n
     */
    public static void printStart01(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
