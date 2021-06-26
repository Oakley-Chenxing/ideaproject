import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName Demo08
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo08 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./myDemoTest.txt"));
        // 一次 读取 一个数组 1k
        byte[] b1 = new byte[1024];
        int len;
        while ((len = bis.read(b1))!= -1){
            System.out.println(new String(b1,0,len));

        }
        // 释放资源
        bis.close();
    }
}
