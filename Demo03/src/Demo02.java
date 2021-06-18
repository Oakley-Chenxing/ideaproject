public class Demo02 {
    public static void main(String[] args) {
        if (true){
            System.out.println(1);
        }
        else{
            System.out.println(2);
        }
        // 只有一句时 可以不写 大括号
        if (true)
            System.out.println(1);// 必须紧跟 else
        else{
            System.out.println(2);
        }
    }
}
