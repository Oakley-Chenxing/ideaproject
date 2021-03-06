package com.chenxing.Demo02;

import java.util.ArrayList;

/**
 * @ClassName StuModel
 * @Description: TODO 数据处理 模型层
 * @Author: lichenxingbeijing@163.com
 */
public class StuModel {
    /**
     * 获取所有的学生信息
     * @return 返回所有学生信息集合
     */
    public ArrayList<Student> getAll() {
        return Global.stuList;
    }

    /**
     * 根据学员的ID 查询数据
     * @param stuID
     * @return 查询结果集合
     */
    public ArrayList<Student> getByStuID(int stuID) {
        ArrayList<Student> resList = new ArrayList<>();
        for(Student stu : Global.stuList){
        if(stuID == stu.getId())
            resList.add(stu);
    }// 查找过程
        return resList;
    }

    /**
     * 根据学生姓名 查询数据
     * @param stuName
     * @return 查询结果集合
     */
    public ArrayList<Student> getByStuName(String stuName){
        ArrayList<Student> resList = new ArrayList<>();
        for(Student stu : Global.stuList){
            if(stuName.equals(stu.getName())) // 字符串的对比
                resList.add(stu);
        }// 查找过程
        return resList;
    }

    /**
     * 根据性别 查询数据
     * @param stuSex
     * @return 查询到的数据集合
     */
    public ArrayList<Student> getByStuSex(String stuSex) {
        ArrayList<Student> resList = new ArrayList<>();
        for(Student stu : Global.stuList){
            if(stuSex.equals(stu.getSex()) )
                resList.add(stu);
        }
        return resList;
    }

    /**
     * 根据年龄范围 查询数据
     * @return 查询到的数据集合
     * @param stuMaxAge,stuMinAge
     */
    public ArrayList<Student> getByStuAge(int stuMinAge, int stuMaxAge) {
        ArrayList<Student> resList = new ArrayList<>();
        for(Student stu : Global.stuList){
            if(stu.getAge() >= stuMinAge && stu.getAge() <= stuMaxAge)
                resList.add(stu);
        }// 查找过程
        return resList;
    }

    /**
     * 根据成绩范围 查询数据
     * @param stuMinScore
     * @param stuMaxScore
     * @return 获取到的学生信息
     */
    public ArrayList<Student> getByStuScore(float stuMinScore, float stuMaxScore) {
        ArrayList<Student> resList = new ArrayList<>();
        for(Student stu : Global.stuList){
            if(stu.getScore() >= stuMinScore && stu.getScore() <= stuMaxScore)
                resList.add(stu);
        }// 查找过程
        return resList;
    }

    /**
     * 添加学员动作
     * @param stuAdd 一个要被添加的学员信息（不包括ID）
     *               如果是 null 结束添加
     * @return 继续返回 true 结束返回 false
     */
    public boolean doAddStu(Student stuAdd) {
        if(null == stuAdd)
            return false;
        Student stu = new Student(Global.stuID++,
                stuAdd.getName(),
                stuAdd.getSex(),
                stuAdd.getAge(),
                stuAdd.getScore());
        return Global.stuList.add(stu);
    }

    /**
     * 根据学生ID 删除学员
     * @param delID 要删除的学生ID
     */
    public void doDelStuByID(int delID) {
        for (int i = 0; i < Global.stuList.size(); i++) {
            if (delID == Global.stuList.get(i).getId()){
                Global.stuList.remove(i);
                return; // 写在方法体内
            }
        }
    }

    /**
     * 更新学员
     * @param stuNew 要更新的学员信息
     */
    public void doUPdate(Student stuNew) {
        for (int i = 0; i < Global.stuList.size(); i++) {
            if (stuNew.getId() == Global.stuList.get(i).getId()) {
                Global.stuList.set(i, stuNew);
                return;
            }
        }
    }
}
