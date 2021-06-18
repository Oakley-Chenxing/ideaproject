public class Demo04 {
    public static void main(String[] args) {
        // 求10 以内 的偶数
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                break;
                // 跳出循环
                //continue;
                // 结束本次循环， 继续下一次循环
                // break && continue 通常与 if 配合使用 否则在 下面的语句毫无意义

            }
            System.out.print(i + "\t");
        }
    }
}
