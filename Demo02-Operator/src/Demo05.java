public class Demo05 {
    public static void main (String[] arg){
        // & 按位与 同1 为1 否为0
        // 101
        // 110
        // 100
        System.out.println("5 & 6 = " + (5 & 6));//4
        // | 按位或 有1 则1 无为0
        System.out.println("5 | 6 = " + (5 | 6));//7
        // ^ 按位异或 相同为0 不同为1
        System.out.println("5 ^ 6 = " + (5 ^ 6));//3
        // ~ 按位取反 1变0 0变1（加1 添负号）
        System.out.println(" ~ 5 = " + ~ 5);
        // << 左移 每向左移1位扩大2倍
        // 100101 37*4=148
        // 10010100
        System.out.println("37 << 2 = " + (37 << 2));
        // >> 右移 每向右移1位缩小2倍 取整
        System.out.println("37 >> 2 = " + (37 >> 2));//9
    }
}
