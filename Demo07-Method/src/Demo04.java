/**
 * 方法的重载
 */
public class Demo04 {
    public static void main(String[] args) {
        int num = printStar();
        System.out.println(num);
         printStar();
         printstar(10);
    }
    // 方法的重载
    // 方法名相同， 参数不同
    // 调用方法的时候，根据调用的实参 来选择具体调用的是哪一个方法
    public static int printStar(){
        System.out.println("* * * * *");
        return 1; // 返回值应与 定义时类型相同
    }
    public static void printstar(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        return; // 用于跳出方法体
        // void 可以写return 但不能写返回值
    }
}
