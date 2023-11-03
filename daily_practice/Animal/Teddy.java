package daily_practice.Animal;

public class Teddy extends Dog{

    @Override
    public void eat() {
        System.out.println("A "+getAge()+"year old Teddy dog named "+getName()+"is eating bone");
    }
}
