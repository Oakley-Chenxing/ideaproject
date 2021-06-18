import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        //用户输入成绩 判断成绩的等级
        System.out.println("please input grade");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        if (grade > 100 || grade <0){
            System.out.println("grade is impossible!");
        }
        if (grade <= 100 && grade >= 90){ // grade >= 90
            System.out.println(grade + ": A");
        }else if(grade < 90 && grade >= 80){
            System.out.println(grade + ": B");
        }else if(grade < 80 && grade >= 70){
            System.out.println(grade + ": C");
        }else if(grade < 70 && grade >= 60){
            System.out.println(grade + ": D");
        }else if(grade < 60 && grade >= 0){
            System.out.println(grade + ": E");
        }

    }
}
