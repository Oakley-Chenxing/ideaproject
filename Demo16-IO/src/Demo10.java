import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName Demo10
 * @Description: TODO 读写效率测试 一次一个字符
 * @Author: lichenxingbeijing@163.com
 */
public class Demo10 {
    public static void main(String[] args) throws IOException {
        final String SRC = "./Rain.mp4";
        final String TO = "./NewRain.mp4";
        long startTime = System.currentTimeMillis();
        method01(SRC,TO);// 158390 ms 总运行时间
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime + " ms");
    }
    public static void method01(String src, String to) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(to);
        int by ;
        while ((by= fis.read())!=-1){
            fos.write(by);
        }
        fis.close();
        fos.close();

    }
}
