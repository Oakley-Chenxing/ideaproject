public class Demo13 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        //arr[0][0] = 66;
        System.out.println(arr.length);
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                System.out.printf(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
