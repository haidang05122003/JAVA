package BaiTapBase_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        double cd = sc.nextDouble();
        System.out.println("Nhap chieu rong: ");
        double cr = sc.nextDouble();

        double cv = (cd +cr)/2;
        double dt = cd * cr;

        System.out.println("Chu vi va dien tich hinh chu nhat la: "
                + "Dien tich:  " + dt + " "+ "Chu vi: " + cv);
    }
}
