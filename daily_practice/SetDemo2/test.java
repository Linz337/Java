package daily_practice.SetDemo2;

public class test {
    public static void main(String[] args) {
        Student s1=new Student("zhangsan",23);
        Student s=new Student("zhangsan",23);
        Student s2=new Student("lisi",16);
        Student s3=new Student("wangwu",20);

        System.out.println(s1.hashCode());
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
