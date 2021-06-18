public class Demo07 {
    public static void main(String[] args) {
        int a = 5;
        // ++
        a++;
        System.out.println(a);
        // --
        a--;
        System.out.println(a);
        System.out.println("----------");
        // a = 5
        // ++运算符后置 先取值 后++
        System.out.println(a++);
        System.out.println(a);
        // ++ 运算符前置 先++ 后取值
        System.out.println(++a);
        System.out.println(a);
    }
}
