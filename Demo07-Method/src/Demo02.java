/*
 * 返回值：public static int xiaoSi xiaosi 前 为返回值类型
 * 方法名： 方法的名称
 * 形参：
 * 实参：
 * 返回：
 * 修饰符: public/ private/ protected/ default/ static/ abstract/ final
 * 调用： int sum = xiaoSi(5,6);
 * 传参：传参的过程相当于给方法形参赋值
 */
public class Demo02 {
    public static void main(String[] args) {
        int mul = Multiplication(7,8);
        System.out.println(mul);
    }

    /**
     *实现两个数 相加的结果
     * @param num1
     * @param num2
     * @return 两个数的和
     */
    public static int Multiplication(int num1, int num2){
        return num1 * num2;
    }
}
