package BaiTapBase_10;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int tong = 0;
        System.out.print("Nhap vao n: ");
        n = sc.nextInt();
        for (int i = 1; i < n; i++) {
                tong+=i;
        }
        System.out.print("Tong cac so la :"+ tong);
    }
}
