package BaiTapBase_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double T,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n va x:");
        n = sc.nextInt();
        x = sc.nextInt();
        if(x == 1){
            T = n + 1;
        }else {
            T = (1 - Math.pow(x, n+1) / (1 -x));
        }
        System.out.println(T);
    }

}
