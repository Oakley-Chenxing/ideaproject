package com.chenxing.Demo03;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName StuPage
 * @Description: TODO 视图层 页面类
 * @Author: lichenxingbeijing@163.com
 */
public class StuPage {
    private StuPage(){}// 构造方法私有化 禁止在类外对其进行实例化

    /**
     * 欢迎界面 获取用户的操作数据
     * @return 用户的操作选项 数字
     */
    public static int welcome() {
        System.out.println("* ************ *");
        System.out.println("1 - 查询学员");
        System.out.println("2 - 添加学员");
        System.out.println("3 - 修改学员");
        System.out.println("4 - 删除学员");
        System.out.println("0 - 退出学员系统");
        System.out.println("* ************ *");
        int a;
        // 设置循环 当输入错的数字 再重新循环输入
        do {
            System.out.println("请输入您想要操作的数字： ");
            a = new Scanner(System.in).nextInt();
        }while (a < 0 || a > 4);
        return a;
    }

    /**
     * 查询二级菜单
     * @return 查询的数据要求
     */
    public static int selShowBy() {
        System.out.println("* ************ *");
        System.out.println("查询功能选择页面");
        System.out.println("1 - 查询全部");
        System.out.println("2 - 按学号查询");
        System.out.println("3 - 按姓名查询");
        System.out.println("4 - 按性别查询");
        System.out.println("5 - 按年龄查询");
        System.out.println("6 - 按成绩查询");
        System.out.println("0 - 退出查询系统");
        System.out.println("* ************ *");
        int a;
        // 设置循环 当输入错的数字 再重新循环输入
        do {
            System.out.println("请输入您想要操作的数字： ");
            a = new Scanner(System.in).nextInt();
        }while (a < 0 || a > 6);
        return a;
    }

    /**
     * 显示所有学生信息
     * @param StuList 学生信息集合
     */
    public static void showStuList(ArrayList<Student> StuList) {
        System.out.printf("┌────┬────────────┬──────┬──────┬──────┐\n");
        System.out.printf("│%-4s│%-12s│%-6s│%-6s│%-6s│\n","ID","Name","Sex","Age","Score");
        for(Student stu : StuList){
            System.out.printf("├────┼────────────┼──────┼──────┼──────┤\n");
            System.out.printf("│%-4d│%-12s│%-6s│%-6d│%-6.1f│\n",
                    stu.getId(),
                    stu.getName(),
                    stu.getSex(),
                    stu.getAge(),
                    stu.getScore());
        }
        System.out.printf("└────┴────────────┴──────┴──────┴──────┘\n");
    }

    /**
     * 获取要查询的学员ID
     * @return 学员ID
     */
    public static int getStuID() {
        System.out.println("请输入要查询的学员ID: ");
        return new Scanner(System.in).nextInt();
    }

    /**
     * 获取要查询的学员 name
     * @return 学员 name
     */
    public static String getStuName() {
        System.out.println("请输入要查询的学员Name: ");
        return new Scanner(System.in).nextLine();
    }

    /**
     * 获取要查询的学员 Sex
     * @return 学员 Sex
     */
    public static String getSex() {
        System.out.println("请输入要查询的学员Sex: ");
        return new Scanner(System.in).nextLine();
    }

    /**
     * 获取要查询的学员年龄范围 最小值
     * @return 学员年龄最小值
     */
    public static int getMinAge() {
        System.out.println("请输入要查询的学员年龄范围 最小值: ");
        return new Scanner(System.in).nextInt();
    }

    /**
     * 获取要查询的学员年龄范围 最大值
     * @return 学员年龄最大值
     */
    public static int getMaxAge() {
        System.out.println("请输入要查询的学员年龄范围 最大值: ");
        return new Scanner(System.in).nextInt();
    }

    /**
     * 获取要查询的学员成绩范围 最小值
     * @return 成绩最小值
     */
    public static int getMinScore() {
        System.out.println("请输入要查询的学员成绩范围 最小值: ");
        return new Scanner(System.in).nextInt();

    }

    /**
     * 获取要查询的学员成绩范围 最大值
     * @return 成绩最大值
     */
    public static int getMaxScore() {
        System.out.println("请输入要查询的学员成绩范围 最大值: ");
        return new Scanner(System.in).nextInt();
    }

    /**
     * 获取一个学员对象 用于添加成员
     * @return 用户输入的成员对象（不包含 ID）
     */
    public static Student getAddStu() {
        System.out.println("请输入新添加的学员姓名");
        String stuName = new Scanner(System.in).nextLine();
        System.out.println("请输入新添加的学员性别");
        String stuSex = new Scanner(System.in).nextLine();
        System.out.println("请输入新添加的学员年龄");
        int stuAge = new Scanner(System.in).nextInt();
        System.out.println("请输入新添加的学员成绩");
        float stuScore = new Scanner(System.in).nextFloat();
    return new Student(stuName,stuSex,stuAge,stuScore);
    }

    /**
     * 获取多个 需要添加的学员对象 用于添加学员
     * @return 多个需要添加的学员对象
     */
    public static Student getMulAddStu() {
        System.out.println("请输入新添加的学员姓名");
        System.out.println("当输入的学生姓名为 over 时 结束添加学生！");
        String stuName = new Scanner(System.in).nextLine();
        if (stuName.equals("over"))
            return null;
        System.out.println("请输入新添加的学员性别: ");
        String stuSex = new Scanner(System.in).nextLine();
        System.out.println("请输入新添加的学员年龄: ");
        int stuAge = new Scanner(System.in).nextInt();
        System.out.println("请输入新添加的学员成绩: ");
        float stuScore = new Scanner(System.in).nextFloat();
        return new Student(stuName,stuSex,stuAge,stuScore);
    }

    /**
     * 操作失败页面
     * @param info
     * 返回操作失败信息
     */
    public static void failed(String info) {
        System.out.println("操作失败！~"+ info);
    }

    /**
     * 弹出是否要执行删除操作
     * true 确认删除
     * false 取消删除
     * @return
     */
    public static boolean delAlert() {
        System.out.println("Y: 确认删除 / N: 取消删除");
        switch (new Scanner(System.in).next()){
            case "Y": case "y":
                return true;
            case "N": case "n":
                return false;
            default:
                System.out.println("输入非法取消操作！");
        }
        return false;
    }

    /**
     * 获取要删除的学员ID
     * @return 获取到的 学员ID
     */
    public static int getDelStuID() {
        System.out.println("请输入要删除的学员ID: ");
        return new Scanner(System.in).nextInt();
    }

    /**
     * 获取到要修改的学员ID
     * @return 学员ID
     */
    public static int getEditStuID() {
        System.out.println("请输入要修改的学员ID: ");
        return new Scanner(System.in).nextInt();
    }

    /**
     * 编辑页面 包含原有信息内容
     * @param student 原有的信息对象
     * @return 新的信息对象
     */
    public static Student editStu(Student student) {
        System.out.println("请输入要修改的学员姓名: "+"("+student.getName()+")");
        String stuName = new Scanner(System.in).nextLine();
        System.out.println("请输入要修改的学员性别: "+"("+student.getSex()+")");
        String stuSex = new Scanner(System.in).nextLine();
        System.out.println("请输入要修改的学员年龄: "+"("+student.getAge()+")");
        int stuAge = new Scanner(System.in).nextInt();
        System.out.println("请输入要修改的学员成绩: "+"("+student.getScore()+")");
        float stuScore = new Scanner(System.in).nextFloat();
        return new Student(student.getId(),stuName,stuSex,stuAge,stuScore);
    }
}
