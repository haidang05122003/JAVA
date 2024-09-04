package Tinh_da_hinh_truu_tuong;

interface IEmployee
{
    int calculateSalary();
    String getName();
}
abstract class Employee1 implements IEmployee 
{
    private String name;
    private int paymentPerHour;

    public Employee1 (String name, int paymentPerHour) {
        super();
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
    public int getPaymentPerHour() {
        return paymentPerHour;
    }
}
class PartTimeEmployee extends Employee1
{
    private int workingHour;
    public PartTimeEmployee (String name, int paymentPerHour, int workingHour) {
        super(name, paymentPerHour);
        this.workingHour = workingHour;
    }
    @Override
    public int calculateSalary() {
        return workingHour * getPaymentPerHour();
    }
}
class FullTimeEmployee extends Employee1
{
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    @Override
    public int calculateSalary() {
        return 8 * getPaymentPerHour();
    }
}
public class bai_tap_interface_class {
    public static void main(String[] args) {
        IEmployee employee1 = new PartTimeEmployee("Mai", 45000, 7);
        System.out.println("Name: "+ employee1.getName());
        System.out.println("Salary per day: "+ employee1.calculateSalary());

        IEmployee employee2 = new FullTimeEmployee("Tung", 50000);
        System.out.println("Name: "+ employee2.getName());
        System.out.println("Salary per day: "+ employee2.calculateSalary());
    }
}
