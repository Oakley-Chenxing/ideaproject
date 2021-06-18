public class Demo01 {
    public static void main(String[] args) {
        // 引用数据类型
        // 直接输出 在内存当中的存贮位置
        //[I@1b6d3586
        // [ 表示数组
        // I 表示 Integer
        // @ 表示后面显示的内存地址
        // 1b6d3586 十六进制数 表示这个数组在内存中的物理地址

        int [] arr = new int[10];
        // 访问 数组成员的方法 数组名【下标】
        // 从 0 开始 到 length - 1 结束
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i +1;
        }
        arr[0] = 1024;
        // 将第一个成员 初始化为 1024


        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);

        }
        // 整型数组中的成员， 在定义之后没有被 手动初始化之前
        // 会被JVM 自动初始化为 0
    }
}
