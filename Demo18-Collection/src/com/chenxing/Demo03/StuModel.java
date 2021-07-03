package com.chenxing.Demo03;

import java.util.ArrayList;

/**
 * @ClassName StuModel
 * @Description: TODO 数据处理 模型层
 * @Author: lichenxingbeijing@163.com
 */
public class StuModel {
    /**
     * 获取所有学生信息
     * @return 返回所有学生信息集合
     */
    public ArrayList<Student> getAll() {
        return Global.stuList;
    }

    /**
     * 根据学员的ID 查询数据
     * @param stuID
     * @return 返回对应的学员信息集合
     */
    public ArrayList<Student> getByStuID(int stuID) {
        ArrayList<Student> resList = new ArrayList<>();
        for (Student stu : Global.stuList){
            if (stuID == stu.getId())
                resList.add(stu);
        }// 查找过程
        return resList;
    }

    /**
     * 根据学员的 name 查询数据
     * @param stuName
     * @return 返回对应的学员信息集合
     */
    public ArrayList<Student> getByStuName(String stuName) {
        ArrayList<Student> resList = new ArrayList<>();
        for (Student stu : Global.stuList){
            if (stuName.equals(stu.getName()))
                resList.add(stu);
        }
        return resList;
    }

    /**
     * 根据要查询的 sex 查询数据
     * @param stuSex
     * @return 返回对应的学员信息集合
     */
    public ArrayList<Student> getByStuSex(String stuSex) {
        ArrayList<Student> resList = new ArrayList<>();
        for (Student stu : Global.stuList){
            if (stuSex.equals(stu.getSex()))
                resList.add(stu);
        }
        return resList;
    }

    /**
     * 根据要查询的年龄范围 查询学员的信息
     * @param stuMinAge
     * @param stuMaxAge
     * @return 适应成绩范围内的学员信息
     */
    public ArrayList<Student> getByStuAge(int stuMinAge, int stuMaxAge) {
        ArrayList<Student> resList = new ArrayList<>();
        for (Student stu : Global.stuList){
            if (stuMinAge <= stu.getAge() && stuMaxAge >= stu.getAge())
                resList.add(stu);
        }
        return resList;
    }

    /**
     *根据输入的学员成绩范围查询学生的信息
     * @param stuMinScore
     * @param stuMaxScore
     * @return 返回查询到的学生信息
     */
    public ArrayList<Student> getByStuScore(int stuMinScore, int stuMaxScore) {
        ArrayList<Student> resList = new ArrayList<>();
        for(Student stu : Global.stuList){
            if (stuMinScore <= stu.getScore() && stuMaxScore >= stu.getScore())
                resList.add(stu);
        }
        return resList;
    }

    /**
     * 添加动作
     * @param stuAdd 一个要被添加的学员信息 不包含 ID
     * @return 成功返回 true 失败返回 false
     */
    public boolean doAddStu(Student stuAdd) {
        // 通过实例化 对象 让ID 自增
        Student stu = new Student(Global.StuID++,
                stuAdd.getName(),
                stuAdd.getSex(),
                stuAdd.getAge(),
                stuAdd.getScore());
        return Global.stuList.add(stu);
    }

    /**
     * 添加多个学员动作
     * @param stuMulAdd 获取到的多个学员信息对象
     * @return
     */
    public boolean doMulAddStudents(Student stuMulAdd) {
        if (null == stuMulAdd)
            return false;
        Student stu = new Student(Global.StuID++,
                stuMulAdd.getName(),
                stuMulAdd.getSex(),
                stuMulAdd.getAge(),
                stuMulAdd.getScore()
                );
        return Global.stuList.add(stu);
    }

    /**
     * 根据获取到的ID 删除对应的学员信息
     * @param delID
     */
    public void doDelStuByID(int delID) {
        for (int i = 0; i < Global.stuList.size(); i++) {
            if (delID == Global.stuList.get(i).getId()){
                Global.stuList.remove(i);
                return;
            }

        }
    }

    /**
     * 通过要修改的学员ID 查询到该学生的数据
     * @param editStuID
     * @return
     */
    public ArrayList<Student> getByEditStuID(int editStuID) {
        ArrayList<Student> resList = new ArrayList<>();
        for (Student stu : Global.stuList){
            if (editStuID == stu.getId())
                resList.add(stu);
        }
        return resList;
    }

    /**
     * 更新学员
     * @param stuNew 要更新的学员信息
     */
    public void doUpdateSte(Student stuNew) {
        for (int i = 0; i < Global.stuList.size(); i++) {
            if(stuNew.getId() == Global.stuList.get(i).getId()){
                Global.stuList.set(i,stuNew);
                return;
            }

        }
    }
}
