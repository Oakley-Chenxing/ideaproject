package com.chenxing.Demo02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName StuPage
 * @Description: TODO 页面类 视图层 数据的展示 和 请求数据的获取
 * @Author: lichenxingbeijing@163.com
 */
public class StuPage {
    private StuPage(){}// 构造方法私有化 禁止在类外对其 进行实例化
    // 生成静态方法

    /**
     * 欢迎页面 获取用户的操作数据
     * @return 用户的操作意图
     */
    public static int welcome() {
        System.out.println("* ************ *");
        System.out.println("1 - 查询学员");
        System.out.println("2 - 添加学员");
        System.out.println("3 - 修改学员");
        System.out.println("4 - 删除学员");
        System.out.println("0 - 退出学员系统");
        int a;
        do {
            System.out.println("请输入正确的数字！");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
        }while ( a < 0 || a > 4);
        return a;
    }

    /**
     * 查询 二级菜单查询
     * @return 查询依据
     */
    public static int selShowBy() {
        System.out.println("* ************ *");
        System.out.println("查询功能选择页面");
        System.out.println("1 - 查询全部");
        System.out.println("2 - 按照学号查询");
        System.out.println("3 - 按照姓名查询");
        System.out.println("4 - 按照性别查询");
        System.out.println("5 - 按照年龄查询");
        System.out.println("6 - 按照成绩查询");
        System.out.println("0 - 退出查询系统");
        System.out.println("* ************ *");
        int a;
        do {
            System.out.println("请输入正确的查询菜单数字！");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
        }while ( a < 0 || a > 6);
        return a;
    }

    /**
     * 显示学生信息 多个
     * @param StuList 学生信息集合(多个)
     */
    public static void showStuList(ArrayList<Student> StuList) {
        System.out.printf("┌────┬────────────┬──────┬──────┬──────┐\n");
        System.out.printf("│%-4s│%-12s│%-6s│%-6s│%-6s│\n","ID","Name","Sex","Age","Score");
        for(Student stu : StuList){
            System.out.printf("├────┼────────────┼──────┼──────┼──────┤\n");
            System.out.printf("│%-4d│%-12s│%-6s│%-6d│%-6.1f│\n",
                    stu.getId(),stu.getName(),stu.getSex(),stu.getAge(),stu.getScore());
        }
        System.out.printf("└────┴────────────┴──────┴──────┴──────┘\n");

    }

    /**
     * 获取要查询的学员ID
     * @return ID
     */
    public static int getStuID() {
        System.out.print("请输入要查询的学员ID: \n");
        return new Scanner(System.in).nextInt();
    }

    /**
     * 获取要查询的学员姓名
     * @return Name
     */
    public static String getStuName(){
        System.out.println("请输入要查询的学员姓名： ");
        return new Scanner(System.in).nextLine();
    }

    /**
     * 获取要查询的学员性别
     * @return Sex
     */
    public static String getStuSex() {
        System.out.println("请输入要查询的学员性别： ");
        return  new Scanner(System.in).nextLine();
    }

    /**
     * 获取要查询的年龄范围  最小值
     * @return minAge
     */
    public static int getStuminAge() {
        System.out.println("请输入要查询的学生年龄范围 最小值：");
        int minAge = new Scanner(System.in).nextInt();
        return minAge;
    }

    /**
     * 获取要查询的年龄范围 最大值
     * @return maxAge
     */
    public static int getStumaxAge() {
        System.out.println("请输入要查询的学生年龄范围 最大值：");
        int maxAge = new Scanner(System.in).nextInt();
        return maxAge;
    }
    /**
     * 获取要查询的成绩范围 最小值
     * @return minScore
     */
    public static float getStuMinScore() {
        System.out.println("请输入要查询的学生成绩范围 最小值：");
        int minScore = new Scanner(System.in).nextInt();
        return minScore;
    }

    /**
     * 获取要查询的成绩范围 最大值
     * @return maxScore
     */
    public static float getStuMaxScore() {
        System.out.println("请输入要查询的学生成绩范围 最大值：");
        int maxScore = new Scanner(System.in).nextInt();
        return maxScore;
    }

    /**
     * 获取一个学生对象 用于添加操作
     * @return 用户输入的学生对象 （不完整的学生对象 不包含ID）
     */
    public static Student getAddStu() {
        System.out.println("请输入要添加的学生姓名： ");
        String stuName = new Scanner(System.in).nextLine();
        System.out.println("请输入要添加的学生性别： ");
        String stuSex = new  Scanner(System.in).nextLine();
        System.out.println("请输入要添加的学生年龄： ");
        int stuAge = new  Scanner(System.in).nextInt();
        System.out.println("请输入要添加的学生成绩： ");
        float stuScore = new Scanner(System.in).nextFloat();
        return new Student(stuName,stuSex,stuAge,stuScore);
    }
}
