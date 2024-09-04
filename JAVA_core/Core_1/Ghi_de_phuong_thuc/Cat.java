package Ghi_de_phuong_thuc;

public class Cat extends Animal{
    public Cat() {
        super("Cat");
    }

    @Override
    public void Eat() {
        System.out.println("an ca");
    }

    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }
}
