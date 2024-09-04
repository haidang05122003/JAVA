package Lop_doi_tuong_bien_phuong_thuc_tinh;

import java.util.Scanner;

class Student
    {
        String name;
        int age;
        public void getInformation()
        {
            Scanner sc = new Scanner(System.in);
             name = sc.next();
             age = sc.nextInt();
             sc.close();
        }
        public void display()
        {
            System.out.println("Name :" + name);
            System.out.println("Age :" + age);
        }
       
    }
public class khai_bao_lop_doi_tuong 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        s1.getInformation();
        s1.display();
    }
    
}
