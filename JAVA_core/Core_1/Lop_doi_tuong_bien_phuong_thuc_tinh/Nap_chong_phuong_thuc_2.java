package Lop_doi_tuong_bien_phuong_thuc_tinh;

class Student3
{
    private String name ; 
    private char gender ;

    public Student3()
    {
        name = "Unknown";
        gender = 'u';
    }
    public Student3(String name)
    {
        this.name = name;
        gender = 'u';
    }
    public Student3(char gender)
    {
        this.gender = gender;
        name = " Unknown";
    }
    public Student3(String name, char gender)
    {
        this.gender = gender;
        this.name = name;
    }
    public void display()
    {
        System.out.println("Name: " + name);
        if(gender =='m')
        {
            System.out.println("Gender: Male");
        }
        else if(gender == 'f')
        {
            System.out.println("Gender: Famale");
        }
        else
        {
            System.out.println("Gender: Unknown");
        }
    }
}
public class Nap_chong_phuong_thuc_2 
{
    public static void main(String[] args)
    {
        Student3 s1 = new Student3();
        s1.display();
        Student3 s2 = new Student3("Dang");
        s2.display();
        Student3 s3 = new Student3('m');
        s3.display();
        Student3 s4 = new Student3("Mai",'f');
        s4.display();
    }
}
