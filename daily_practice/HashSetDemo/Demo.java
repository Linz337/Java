package daily_practice.HashSetDemo;

import daily_practice.SetDemo2.Student;

import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        //创建学生对象
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",16);
        Student s3=new Student("wangwu",20);
        Student s=new Student("zhangsan",23);

        //创建集合添加学生
        HashSet<Student> hs=new HashSet<>();

        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s));

        System.out.println(hs);
    }
}
