import java.io.*;

/**
 * @ClassName Demo06
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo06 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./Social.png");
        FileOutputStream fos = new FileOutputStream("./NewSocial.png");
        // 一边读 一边写
        // 每次只写一个字节
        int b1 = 0;
        while((b1 = fis.read())!= -1){
            fos.write(b1);
        }
        // 每次读写一个数组 1k 读写速度更快一些
        FileInputStream fis1 = new FileInputStream("./Social.png");
        FileOutputStream fos2 = new FileOutputStream("./NewSocial01.png");
        byte[] b2 = new byte [1024];
        int len;
        while((len = fis1.read(b2))!= -1){
            fos2.write(b2,0,len);
        }

        // 释放资源
        fos.close();
        fis.close();
        fis1.close();
        fos2.close();

    }
}
