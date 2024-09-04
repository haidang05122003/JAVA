package Tinh_ke_thua;

class Employee
{
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    public void display() {
        System.out.println("Name: "+ name);
        System.out.println("Salary: "+salary);
    }
}
class Manager extends Employee {
    private int bonus;

    public Manager (String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    public int getSalary() {
        return super.getSalary() + bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public int getBonus() {
        return bonus;
    }
    public void display() {
        System.out.println("Name: "+ getName());
        System.out.println("Salary: "+getSalary());
    }
}
public class bai_tap_ke_thua1 {
    public static void main(String[] args) {
        Employee e = new Employee("Dang", 1000);
        e.display();
        Manager m = new Manager("Dat", 1000, 2000);
        m.display();
    }
}
