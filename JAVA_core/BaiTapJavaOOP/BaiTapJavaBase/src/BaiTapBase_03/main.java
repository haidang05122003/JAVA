package BaiTapBase_03;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao nhiet do (oC): ");
        double C = sc.nextDouble();
        double F = (9.0/5.0 * C) + 32;
        System.out.println("Nhiet do (oF) la:  " + F);
    }
}
