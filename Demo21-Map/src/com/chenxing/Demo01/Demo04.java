package com.chenxing.Demo01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName Demo04
 * @Description: TODO map 集合中存储并遍历学生类对象
 * @Author: lichenxingbeijing@163.com
 */
public class Demo04 {
    public static void main(String[] args) {
        HashMap<String,Student> hm = new HashMap<>();

        hm.put("Stu01",new Student("Andy",11));
        hm.put("Stu02",new Student("Amma",12));
        hm.put("Stu03",new Student("Alex",13));
        hm.put("Stu04",new Student("Alsander",14));

        // 方法1 对值进行遍历
//        Collection<Student> values = hm.values();
//        for(Student stu:values){
//            System.out.println(stu.getName() + ", " + stu.getAge());
//        }

//        // 方法 2 对键进行遍历
//        Set<String> keySet = hm.keySet();
//        for(String key:keySet){
//            Student stu = hm.get(key);
//            System.out.println(key + ", "+ stu.getName()+", "+stu.getAge());
//    }

        // 方法 3 对键值对进行遍历
        Set<Map.Entry<String, Student>> es = hm.entrySet();
        for (Map.Entry<String, Student> e : es) {
            String key = e.getKey();
            Student stu = e.getValue();
            System.out.println(key + ", "+ stu.getName()+", "+stu.getAge());
        }



    }
}
