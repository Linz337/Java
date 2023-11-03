package daily_practice.Animal;

public class HuskyDog extends Dog{

    @Override
    public void eat() {
        System.out.println("A "+getAge()+"year old husky dog named "+getName()+"is eating bone");
    }
}
