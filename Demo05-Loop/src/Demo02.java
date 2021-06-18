public class Demo02 {
    // 先执行 循环体 再执行判断
    // 无论 循环条件是否存在，循环体至少被执行一次
    // 场景化： 判断起床 睁眼看时间
    // 有经验厨子，先搅拌，再判断气泡
    public static void main(String[] args) {
        int n = 1;
        do{
            System.out.print(n + "\t");
            n ++;
        }while(n<=10);
    }
}
