package Ghi_de_phuong_thuc;

public class Bird extends Animal{
    public Bird() {
        super("Bird");
    }

    @Override
    public void Eat() {
        System.out.println("Toi an sau");
    }

    @Override
    public void makeSound() {
       System.out.println("hoi hoi");
    }
}
