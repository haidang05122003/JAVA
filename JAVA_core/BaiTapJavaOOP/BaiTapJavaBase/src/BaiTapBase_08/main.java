package BaiTapBase_08;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 3 so: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a>b){
            System.out.println("A= "+ a+ " La so lon nhat");
        }else if(b>c){
            System.out.println("B= "+ b+ " La so lon nhat");
        }else {
            System.out.println("C= "+ c+ " La so lon nhat");
        }
    }
}
