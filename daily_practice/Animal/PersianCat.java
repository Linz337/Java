package daily_practice.Animal;

public class PersianCat extends Cat{
    @Override
    public void eat() {
        System.out.println("A "+getAge()+"year old persian cat named "+getName()+"is eating biscuit");
    }
}
