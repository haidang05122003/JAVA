package Lop_doi_tuong_bien_phuong_thuc_tinh;

import java.util.Scanner;

    class HCN
    {  
        double length, width;
        public void getInformation()
        {
            Scanner sc = new Scanner(System.in);
            length = sc.nextDouble();
            width = sc.nextDouble();
            sc.close();
        }
        public double getArea()
        {
            return length * width;
        }
        public double getPerimeter()
        {
            return (length + width) * 2;
        }
        public void display()
        {
            System.out.println("Area: " + getArea());
            System.out.println("Perimeter: " + getPerimeter());
        }

    }      
    public class LTHDT_Cv_DTich_HCN
    {
        public static void main(String[] args) 
        {
            HCN r = new HCN();
            r.getInformation();
            r.display();
        }
    }
