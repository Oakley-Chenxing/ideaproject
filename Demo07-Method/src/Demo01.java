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
public class Demo01 {
    public static void main(String[] args) {
        int sum = xiaoSi(5,6); // 调用函数 传递实参 5.6 是实参
        // 传参的过程相当于给方法形参赋值
        System.out.println(sum);
    }
   public static int xiaoSi(int num1, int num2){ // int num1, int num2 形参
        return num1 + num2;
    }
}
