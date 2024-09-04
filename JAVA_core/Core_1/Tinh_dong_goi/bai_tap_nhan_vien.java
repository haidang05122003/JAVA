package Tinh_dong_goi;

class Employee
{
    private int id;
    private String firstName, lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFullName() {
        return firstName + " " +  lastName;
    }
    public int getSalary(){
        return salary;
    }
}
public class bai_tap_nhan_vien {
    public static void main(String[] args) {
        Employee e = new Employee(101, "Dang","Hoang" , 10000);
        System.out.println("Id: " + e.getId());
        System.out.println("Name: " + e.getFullName());
        System.out.println("Salary: " + e.getSalary());
        
    }
}
