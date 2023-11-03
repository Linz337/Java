package daily_practice;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo2 {
    public static void main(String[] args) {
        Person a=new Person("aa",18,1.68);
        Person b=new Person("bb",26,1.82);
        Person c=new Person("cc",23,1.78);

        //定义数组存储信息
        Person[] arr={a,b,c};

        //匿名内部类
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                double temp=o1.getAge()-o2.getAge();
                temp=temp==0?o1.getHeight()-o2.getHeight():temp;
                //string类型要用compareto比较
                temp=temp==0?o1.getName().compareTo(o2.getName()):temp;
                if (temp>0){
                    return 1;
                }
                else if (temp<0){
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });

        //lambda
        Arrays.sort(arr, (o1, o2)-> {
                double temp=o1.getAge()-o2.getAge();
                temp=temp==0?o1.getHeight()-o2.getHeight():temp;
                //string类型要用compareto比较
                temp=temp==0?o1.getName().compareTo(o2.getName()):temp;
                if (temp>0){
                    return 1;
                }
                else if (temp<0){
                    return -1;
                }
                else {
                    return 0;
                }
        });

        System.out.println(Arrays.toString(arr));
    }
}
class Person{
    private String name;
    private int age;
    private double height;

    public Person(String name,int age,double height){
        this.age=age;
        this.height=height;
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
