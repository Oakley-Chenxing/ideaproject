package com.chenxing.Demo02;

import java.util.ArrayList;

/**
 * @ClassName StuController
 * @Description: TODO 功能调度 控制器
 * @Author: lichenxingbeijing@163.com
 */
public class StuController {
    private StuModel sm = new StuModel();
    /**
     * 总控制器 功能调度方法
     *
     * @param a
     */
    public void action(int a) {
        switch (a){
            case 1://查询
                // 定义一个二级页面
                // 通过二级页面获取一个查询请求数据
                int sa = StuPage.selShowBy();
                // 查询功能调度 - 二次菜单调度器
                selAction(sa);
                break;
            case 2://添加
                // 一次添加一个成员
                // 获取一个要添加的成员
                Student stuAdd = StuPage.getAddStu();
                // 将要添加的学员对象传递给 Model 层来实现添加
                boolean b = sm.doAddStu(stuAdd);
                break;
            case 3://修改
                System.out.println("修改");
                break;
            case 4://删除
                System.out.println("删除");
                break;
            case 0://退出学员系统
                System.out.println("退出学员系统");
                System.exit(0);
                break;
        }
    }

    private void selAction(int sa) {
        switch (sa){
            case 1:
                // 获取所有学员信息
                // 相当于向厨子要菜
                ArrayList<Student> allStuList = sm.getAll();
                // 通过页面输出信息
                // 相当于 上菜
                StuPage.showStuList(allStuList);
                break;
            case 2://按照学号查询
                // 获取学号
                int stuID = StuPage.getStuID();
                // 通过学号获取学员
                ArrayList<Student> stuListByID = sm.getByStuID(stuID);
                // 显示学员
                StuPage.showStuList(stuListByID);
                break;
            case 3://按照姓名查询
                // 获取学员姓名
                String stuName = StuPage.getStuName();
                // 通过姓名获取学员信息
                ArrayList<Student> stuListByName = sm.getByStuName(stuName);
                // 显示学员
                StuPage.showStuList(stuListByName);
                break;
            case 4://按照性别查询
                // 获取学员性别
                String stuSex = StuPage.getStuSex();
                // 通过性别获取学生信息
                ArrayList<Student> stuListBySex = sm.getByStuSex(stuSex);
                // 显示学生信息
                StuPage.showStuList(stuListBySex);
                break;
            case 5://按照年龄查询
                // 获取学员年龄区间
                int stuminAge = StuPage.getStuminAge();
                int stumaxAge = StuPage.getStumaxAge();
                // 通过学员年龄区间获取学生信息
                ArrayList<Student> stuListByAge = sm.getByStuAge(stuminAge,stumaxAge);
                // 显示学生信息
                StuPage.showStuList(stuListByAge);
                break;
            case 6://按照成绩查询
                // 获取学员成绩范围
                float stuMinScore = StuPage.getStuMinScore();
                float stuMaxScore = StuPage.getStuMaxScore();
                // 通过成绩区间获取学生信息
                ArrayList<Student> stuListByScore = sm.getByStuScore(stuMinScore,stuMaxScore);
                // 显示学生信息
                StuPage.showStuList(stuListByScore);
                break;
            case 0: break;
        }
    }
}
