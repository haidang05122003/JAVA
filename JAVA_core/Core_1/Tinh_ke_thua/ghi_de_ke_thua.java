package Tinh_ke_thua;

class Person1
{
    private String name;
    private String gender;

    public Person1(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
    public void setName(String name) { 
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    public void display() {
        System.out.println("Name: "+ name);
        System.out.println("Gender: "+ gender);
    }
}
class Student1 extends Person1 {
    private int salary;
    public Student1(String name, String gender, int salary) {
        super(name, gender);
        this.salary = salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    public void display() {
        super.display();
        System.out.println("Salary: " +salary);
    }
}
public class ghi_de_ke_thua {
    public static void main(String[] args) {
        Student1 s = new Student1("Dang", "Male", 2000);
        s.display();
    }
}
