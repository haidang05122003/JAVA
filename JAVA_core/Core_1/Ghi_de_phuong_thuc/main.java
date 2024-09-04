package Ghi_de_phuong_thuc;

public class main {
    public static void main(String[]args) {
        System.out.println("Test dog: ");
        Dog d = new Dog();
        d.Eat();
        d.makeSound();
        d.sleep();

        System.out.println("Test cat: ");
        Cat c= new Cat();
        c.Eat();
        c.makeSound();
        c.sleep();

        System.out.println("Test bird: ");
        Bird b = new Bird();
        b.Eat();
        b.makeSound();
        b.sleep();
    }
}
