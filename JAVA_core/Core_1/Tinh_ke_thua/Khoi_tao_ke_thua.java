package Tinh_ke_thua;

class Person
{
    private String name;
    private int dob;

    public Person(String name, int dob){
        this.name = name;
        this.dob = dob;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setDob(int dob) {
        this.dob = dob;
    }
    public int getDob() {
        return dob;
    }
}
class Student extends Person{
    private double gpa;
    public Student (String name, int dob, double gpa){
        super(name, dob);
        this.gpa = gpa;
    }
    public void setGpa(int gpa){
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }
}
public class Khoi_tao_ke_thua {
    public static void main(String[] args) {
        Student s = new Student("Dang", 2003, 7.5);
        System.out.println("Name: "+s.getName());
        System.out.println("Date of birth: "+s.getDob());
        System.out.println("GPA: "+s.getGpa());

    }
}
