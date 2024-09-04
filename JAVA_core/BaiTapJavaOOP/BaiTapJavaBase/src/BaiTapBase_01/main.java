package BaiTapBase_01;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.println("Nhap vao so A: ");
        a = sc.nextInt();
        System.out.println("Nhap vao so B: ");
        b = sc.nextInt();

        int tong = a + b;
        System.out.println("Tong: "+tong);
    }
}
