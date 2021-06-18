public class Demo18 {
    public static void main(String[] args) {
        System.out.println("2,");
        for (int i = 3,j; i <= 100; i++) { // 注意 j  作用于全局变量
            // 只能被1 和自己整除的数 为素数
            for (j = 2; j <i ; j++) {
                if (i % j == 0)
                    break;

            }// 这个循环结束还没除开 为素数 没有执行 break
             // 进入下一步 此时 j 大于等于i
            if (!(j<i))
                System.out.print(i + ",");

        }
    }
}
