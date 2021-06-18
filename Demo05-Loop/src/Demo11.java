public class Demo11 {
    //输出9行9列的星号矩形
    public static void main(String[] args) {
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j < 9 ; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println();// 每输出一行之后 输出一个换行
        }
    }
}
