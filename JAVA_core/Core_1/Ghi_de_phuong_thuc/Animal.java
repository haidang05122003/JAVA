package Ghi_de_phuong_thuc;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Eat() {
        System.out.println("toi dang an");
    }

    public void makeSound() {
        System.out.println("...............");
    }

    public void sleep() {
        System.out.println("zzzzzz");
    }

}
