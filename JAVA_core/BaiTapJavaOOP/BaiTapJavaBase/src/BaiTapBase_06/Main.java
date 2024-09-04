package BaiTapBase_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double cv, dt;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh A: ");
        double a = sc.nextDouble();
        System.out.print("Nhap canh B: ");
        double b = sc.nextDouble();
        System.out.print("Nhap canh C: ");
        double c = sc.nextDouble();

        if( a+b>c || a+c>b || a+c>b ){
           cv = a + b + c;
           double s = (a + b + c) / 2;
           dt = Math.sqrt(s*(s - a)*(s - b)*(s - c));
           System.out.printf("Dien tich va chu vi la: " + "Dien tich: " + dt
                + " Chu vi: "+ cv);
        }
    }
}
