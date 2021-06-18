
public class QuickSort {
    public static int[] qSort(int arr[],int start,int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i<j) {
            while ((i<j)&&(arr[j]>pivot)) {
                j--;
            }
            while ((i<j)&&(arr[i]<pivot)) {
                i++;
            }
            if ((arr[i]==arr[j])&&(i<j)) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (i-1>start) arr=qSort(arr,start,i-1);
        if (j+1<end) arr=qSort(arr,j+1,end); // 递归调用 在方法中 自己调用自己
        return (arr);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{999,888,777,666,555,444,333,222,111};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        int len = arr.length-1;
        arr=qSort(arr,0,len);
        for (int i:arr) {
            System.out.print( i+" ");
        }
    }
}
