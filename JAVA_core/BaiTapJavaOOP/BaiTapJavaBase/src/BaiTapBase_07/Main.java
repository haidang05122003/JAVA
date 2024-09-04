package BaiTapBase_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,tmp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so A: ");
         a = sc.nextInt();
        System.out.print("Nhap vao so B: ");
         b = sc.nextInt();
        tmp = a;
        a = b;
        b = tmp;
        System.out.print("Gia tri cua A va B la:  " + "A = " + a + " B = " + b);
    }
}
