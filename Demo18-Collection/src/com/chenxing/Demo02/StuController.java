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
                // 插入多个学员 输入 over 作为学生姓名时 就不再继续添加
                // 获取一个要添加的成员
                // Student stuAdd = StuPage.getAddStu();
                // 将要添加的学员对象传递给 Model 层来实现添加
                while(sm.doAddStu(StuPage.getAddStu()));
                // boolean b = sm.doAddStu(stuAdd);
                break;
            case 3://修改
                // 获取要修改的学员ID
                int editStuID = StuPage.getStuEditID();
                // 通过 ID 查询出要修改的学员信息
                ArrayList<Student> editStu = sm.getByStuID(editStuID);
                // 在编辑页面中显示原有的学员信息 并且等待输入新的信息
                Student stuNew = StuPage.editStu(editStu.get(0));
                // 更新学员信息
                sm.doUPdate(stuNew);
                break;
            case 4://删除
                // 获取要删除的学员ID
                int delID = StuPage.getDelID(); // 通过 getDelID 来获取到需要删除的学员ID
                // 输出要删除的信息
                ArrayList<Student> delStu = sm.getByStuID(delID); // 通过 getByStuID 来处理需要删除的 学生对象（查询到该对象，并将信息以集合的形式返回）
                // 并将该对象以集合的形式存储到 ArrayList当中
                if(!delStu.isEmpty()){ // 判断该集合是否为空 不为空则输出
                    StuPage.showStuList(delStu); // 输出需要删除的对象
                    //boolean delB = StuPage.delAlert();
                    if (StuPage.delAlert()){ // 如果 确定要删除该对象 则执行删除  否则什么都不做
                        sm.doDelStuByID(delID); // 执行删除操作
                        System.out.println("删除成功！");
                    }
                }else{
                    StuPage.failed("学生信息不存在，删除失败！");
                }
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
