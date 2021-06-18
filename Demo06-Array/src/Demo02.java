public class Demo02 {
    public static void main(String[] args) {
       // int[] arr = new int[10];
       // char[] arr = new char[10];
        //float[] arr = new float [10];
        //String[] arr = new String [10];
        // String[] arr = {"1","2","3","4","5","6","7","8"}
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        // 定义时 直接初始化 等号后面初始化的个数 为所定义数组的长度
        // 数组的长度在定义之后无法改变
        // 否则出现 越界异常

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + "\t");

        }

    }
}
