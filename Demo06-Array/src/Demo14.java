public class Demo14 {
    public static void main(String[] args) {
        int[][] arr =
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i < j){ // > or < all is ok
                    arr[i][j] ^= arr[j][i];
                    arr[j][i] ^= arr[i][j];
                    arr[i][j] ^= arr[j][i];

                }
            }
        }

        System.out.println("转置后");
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
