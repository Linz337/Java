package daily_practice.Animal;

public abstract class Animal {
    // extends & generics
    private String name;
    private int age;
    public Animal(){

    }
    public Animal(String name,int age){
        this.age=age;
        this.name=name;
    }
//    public abstract void eat();


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



}
