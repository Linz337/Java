package daily_practice.Animal;

public class Lihuacat extends Cat{
    @Override
    public void eat() {
        System.out.println("A "+getAge()+"year old lihua cat named "+getName()+"is eating biscuit");
    }
}
