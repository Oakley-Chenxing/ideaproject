/*
    yanghui sanjiao
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
  // 除了 两条等腰边之外，中间的数字等于 头顶上两个数 相加的和
 */
public class Demo15 {
    public static void main(String[] args) {
        int [][] triangle = new int[5][5];
        for (int i = 0; i < 5; i++) {
            triangle[i][0] = 1;
            triangle[i][i] = 1;
        }
        for (int i = 2; i < 5; i++) {
            for (int j = 1; j <i ; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }

        }
        for (int i = 0; i <triangle.length ; i++) {
            for (int j = 0; j <= triangle.length-i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf(triangle[i][j] + " ");
            }
            System.out.println();
        }

    }
}
