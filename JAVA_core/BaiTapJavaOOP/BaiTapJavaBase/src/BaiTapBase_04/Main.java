package BaiTapBase_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao nhiet do (o F): ");
        double F = sc.nextDouble();
        double C = (F -32)/1.8;
        System.out.println("Nhiet do (o C): " + C);
    }
}
