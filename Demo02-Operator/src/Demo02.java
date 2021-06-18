import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.net.SocketTimeoutException;

/*
 * @ClassName Demo01
 * @Description: 逻辑运算符
 * @Author:  Chenxing Li;
 */
public class Demo02 {
    public static void main(String[] args) {
        // &&  A && B -> 当 A 和 B 均为 true 则 true
        System.out.println("true && true =" + (true && true));
        System.out.println("true && false =" + (true && false));
        System.out.println("false && false =" + (false && false));
        System.out.println("-------------" );
        //  || 逻辑或 A || B 有真则真
        System.out.println("true || true =" + (true || true));
        System.out.println("false || true =" + (false || true));
        System.out.println("false || false =" + (false || false));
        System.out.println("-------------" );
        // ！ 非真既假 非假既真
        System.out.println("!true =" + (!true));
        System.out.println("!false =" + (!false));
        System.out.println("-------------" );
        // 短路机制
        int a = 5, b = 6;
        System.out.println((a = 9) > 0 || (b = 8) > 0);
        // ||短路 有真 为真 第一个表达式为真 后面形成短路
        System.out.println("a = " + a + "\nb = " + b );
        // $$ 短路
        System.out.println((a = 7) <0 && (b = 10)> 0);
        System.out.println("a = " + a + "\nb = " + b);
    }
}
