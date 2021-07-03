package com.chenxing.Demo03;

import java.util.ArrayList;

/**
 * @ClassName StuController
 * @Description: TODO 功能调度 控制器
 * @Author: lichenxingbeijing@163.com
 */
public class StuController {
    private StuModel sm = new StuModel(); // 实例化 sm 对象
    /**
     *功能调度方法
     * @param a 返回用户请求数据 用户选择的功能
     */
    public void action(int a) {
        switch (a){
            case 1: // 查询
                // 定义一个二级页面
                // 通过二级页面获取一个查询请求数据
                int sa = StuPage.selShowBy();
                // 查询功能调度
                selAction(sa);
                break;

                case 2: // 添加
                // 每次添加一个成员
                // Student stuAdd = StuPage.getAddStu();
                // 获取一个要添加的学员对象 将要添加的学员对象传递给 Model 层实现添加
                // boolean b = sm.doAddStu(stuAdd);

                // 每次添加多个学员 当输入“over” 作为学生名的时候 就不再继续参加
                // 继续添加执行循环 不进行返回 null

                // 输出 请输入 添加学生信息界面
                //Student stuMulAdd = StuPage.getMulAddStu();
                while(sm.doMulAddStudents(StuPage.getMulAddStu()));
                break;

            case 3: // 修改
                // 获取要修改的学员ID
                int editStuID = StuPage.getEditStuID();
                // 通过ID 查询到要修改的学员信息
                ArrayList<Student> editStu = sm.getByEditStuID(editStuID);
                // 在编辑页面中输出原有的学员信息 并 要求输入新的学员信息
                Student StuNew = StuPage.editStu(editStu.get(0));
                // 执行更新操作
                sm.doUpdateSte(StuNew);
                break;

            case 4: // 删除
                // 获取到要删除的学员ID
                int delID = StuPage.getDelStuID();
                // 输出确认删除的学员信息

                ArrayList<Student> delStu = sm.getByStuID(delID);
                // 判断获取到的ID 是否存在
                if (!delStu.isEmpty()){
                    // 显示要删除的学员信息
                    StuPage.showStuList(delStu);
                //    boolean delb = StuPage.delAlert();
                    // 如果是真 执行删除操作
                    if(StuPage.delAlert()){    // Alert() 功能 y | Y　确认删除　ｎ｜Ｎ　取消删除
                        sm.doDelStuByID(delID);
                        System.out.println("删除成功！"); // 显示删除成功
                    }
                } else {
                    StuPage.failed("该学生信息不存在！");
                }

                break;
            case 0: // 退出学员系统
                System.out.println("已退出系统");
                System.exit(0);
                break;
            default:
                System.out.println("请输入正确的数字");
        }
    }

    private void selAction(int sa) {

        switch (sa){
            case 1:// 获取所有学员信息
                // 向厨子要菜
                ArrayList<Student> allStuList = sm.getAll();
                // 通过页面输出信息
                // 上菜
                StuPage.showStuList(allStuList);
                break;
            case 2:// 按照学号查询
                // 获取学号
                int stuID = StuPage.getStuID();
                // 通过学号获取学员信息
                ArrayList<Student> stuListByID = sm.getByStuID(stuID);
                // 显示学员信息
                StuPage.showStuList(stuListByID);
                break;
            case 3:// 按姓名查询
                // 获取姓名
                String stuName = StuPage.getStuName();
                // 通过姓名获取学员信息
                ArrayList<Student> stuListByName = sm.getByStuName(stuName);
                // 显示学员信息
                StuPage.showStuList(stuListByName);
                break;
            case 4:// 按性别查询
                // 获取要查询的学员性别
                String stuSex = StuPage.getSex();
                // 通过性别获取到学员信息
                ArrayList<Student> stuListBySex = sm.getByStuSex(stuSex);
                // 显示学员信息
                StuPage.showStuList(stuListBySex);
                break;
            case 5:// 按年龄查询
                // 获取要查询的年龄范围
                int stuMinAge = StuPage.getMinAge();
                int stuMaxAge = StuPage.getMaxAge();
                // 通过年龄范围获取到学员信息
                ArrayList<Student> stuListByAge = sm.getByStuAge(stuMinAge,stuMaxAge);
                // 显示该年龄范围内的学员信息
                StuPage.showStuList(stuListByAge);
                break;
            case 6:// 按成绩查询
                // 获取要查询的成绩范围
                int stuMinScore = StuPage.getMinScore();
                int stuMaxScore = StuPage.getMaxScore();
                // 通过成绩范围 查询到学生的信息
                ArrayList<Student> stuListByScore = sm.getByStuScore(stuMinScore,stuMaxScore);
                // 显示学生信息
                StuPage.showStuList(stuListByScore);
                break;
            case 0:// 退出查询系统
                break;
        }
    }
}
