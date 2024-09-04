package Ghi_de_phuong_thuc;

public class Dog extends Animal{
    public Dog() {
        super("Dog");
    }

    @Override
    public void Eat() {
       System.out.println("an xuong");
    }

    @Override
    public void makeSound() {
        System.out.println("Gau gau");
    }
}
