package Tinh_da_hinh_truu_tuong;

abstract class Person
{
    private String name;
    private String address;
    
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public abstract void display();

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
}
class Employee extends Person
{
    private int salary;
    public Employee (String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    @Override
    public void display() {
        System.out.println("Employee name: " + super.getName());
        System.out.println("Employee address: " + super.getAddress());
        System.out.println("Employee salary: " + salary);
    }
}
class Customer extends Person
{
    private int balance;
    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }
    @Override
    public void display() {
        System.out.println("Customer name: " + super.getName());
        System.out.println("Customer address: " + super.getAddress());
        System.out.println("Customer salary: " + balance);
    }
}

public class bai_tap_truu_tuong {
    public static void main(String[] args) {
        Person person1 = new Employee("Dang", "HaNoi", 3300);
		Person person2 = new Customer("Linh", "BacNinh", 10400);
		person1.display();
		person2.display();
    }
    
}
