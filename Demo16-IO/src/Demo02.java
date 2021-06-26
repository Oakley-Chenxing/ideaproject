import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName Demo02
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 */
public class Demo02 {
    public static void main(String[] args){

        FileOutputStream fos = null;
        // alt + Enter 处理异常
        // try 把容易出现的异常内容写在try 当中
        // catch 捕获异常
        try {
            fos = new FileOutputStream("./myDemoTest01.txt");
        } catch (IOException e) {
            e.printStackTrace();
            // System.out.println(); 自定义自己的 异常解决方法
        }

        byte[] bytes = {65,66,67,68,69};
        try {
            fos.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // finally 不管异常是否出现 都会执行的语句块
        finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
