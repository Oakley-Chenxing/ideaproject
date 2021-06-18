/*
 * @ClassName Demo01
 * @Description: 算术运算符
 * @Author:  Chenxing Li;
 */
public class Demo01 {
    public static void main(String[] args){
        System.out.println("3 + 2 =" + (3 + 2));
        System.out.println("3 - 2 =" + (3 - 2));
        System.out.println("3 * 2 =" + (3 * 2));
        System.out.println("3 / 2 =" + (3 / 2));
        // Java 除法运算 整型类型除法运算得到的结果是商 不包含余数和小数
        // 有除法运算参与的时候， 除数不能为0
        //System.out.println("3 / 0 =" + (3 / 0));
        //System.out.println("3 % 0 =" + (3 % 0));
        //被除数可以为0
        System.out.println("0 / 2 =" + (0 / 2));
        System.out.println("3 / 2.0 =" + (3 / 2.0));
        // 有浮点数参与的除法运算得到的是包含小数的
        System.out.println("3 % 2 =" + (3 % 2));
        // 取余 运算得到的结果都是余数
        // 区域 运算两端一般都使用整数类型
    }
}
