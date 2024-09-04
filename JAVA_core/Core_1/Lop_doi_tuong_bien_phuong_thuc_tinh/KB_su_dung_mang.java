package Lop_doi_tuong_bien_phuong_thuc_tinh;

class hocsinh
{
    private String name;
    private int age;
    public hocsinh(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void display()
    {
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }
}
public class KB_su_dung_mang 
{
    public static void main(String[] args) 
    {
        hocsinh[]hocsinhs = new hocsinh[3];
        hocsinhs[0] = new hocsinh("Dang", 21);
        hocsinhs[1] = new hocsinh("Duc", 23);
        hocsinhs[2] = new hocsinh("Hung", 21);
        for(int i = 0; i< 3; i++)
        {
            hocsinhs[i].display();
        }
    }
}
