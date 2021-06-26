import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName Demo03
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo03 {
    public static void main(String[] args) throws IOException {
        // 定义一个输入流对象 将内容输出到当前程序中
        FileInputStream fis = new FileInputStream("./myDemoTest01.txt");
        int b1 = fis.read();
        System.out.println(b1);// 输出的是 asII 码
        System.out.println((char) b1);
        b1 = fis.read(); // 方法指针 自动往后走
        //System.out.println(b1);// 输出的是 asII 码
        System.out.println((char) b1);
        b1 = fis.read();
        //System.out.println(b1);// 输出的是 asII 码
        System.out.println((char) b1);
        System.out.println("==========================");
//        int b2 = fis.read();
//        while (b2 != -1){
//            System.out.println((char)b2);
//            b2 = fis.read();// 指向下一个
//        }

        // 读一个字符 输出一个字符
        int b3 = 0;
        while ((b3 = fis.read()) != -1){
            System.out.println((char)b3);
        }
        // 释放IO 资源
        fis.close();

    }
}
