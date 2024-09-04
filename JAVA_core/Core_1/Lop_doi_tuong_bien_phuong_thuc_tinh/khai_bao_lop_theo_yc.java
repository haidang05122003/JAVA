package Lop_doi_tuong_bien_phuong_thuc_tinh;

class Student2
{
    private String name;
    private int age;
    private String gender;
    private double gpa;
    public Student2(String name, int age, String gender, double gpa)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.gpa = gpa;
    }
    public void display()
    {
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Gender: "+ gender);
        System.out.println("GPA: "+ gpa);
    }
}
public class khai_bao_lop_theo_yc 
{
    public static void main(String[] args) 
    {
        Student2 s = new Student2("Dang", 21, "Male", 8.0);
        s.display();
    }
}
