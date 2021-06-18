import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * 函数可以嵌套调用 ， 不可以嵌套定义
 */
public class Demo05 {
    public static void main(String[] args) {
        int sum2 = methodSum(1,2);
        int sum1 = methodSum(4,5,6);
        int sum3 = methodSum(methodSum(1,2),3);// 嵌套调用
        System.out.println(sum2);
        System.out.println(sum1);
        System.out.println(sum3);
        System.out.println(methodSum(methodSum(1,2),3));// 嵌套调用
        System.out.println(methodMax(1,2));
        System.out.println(methodMax(methodMax(5,6),7));
    }
    public static int methodMax(int a,int b){
       return  a>b ? a:b;
    }

    public static int methodSum(int a, int b){
        return  a + b;
    }
    public static int methodSum(int a, int b, int c){
        return  a + b + c;
    }
}
