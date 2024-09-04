package Bai_tap_chuoi;

import java.util.Scanner;

public class Vidu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("nhap vao chuoi: ");
        s = sc.nextLine();
        System.out.println("---------");

        //ham length()==> lay ra do dai cua chuoi
        System.out.println(s.length());

        //ham chatAt() ==> lay ra ky tu o 1 vi tri bat ki
        int doDai = s.length();
        for(int i = 0; i < doDai; i++) {
            System.out.println("Vi tri "+ i +" la : "+s.charAt(i));
        }

        //ham getChar() ==> lay hang loat ki tu (vi tri bat dau, ket thuc,
        // mang luu du lieu, vi tri bat dau luu cua mang
        char[] arrayChar = new char[100];
        s.getChars(0,5,arrayChar,0);
        for(int i = 0; i<arrayChar.length; i++) {
            System.out.println("Mang gia tri hien tai: "+ i + " La: "+arrayChar[i]);
        }

        //ham getBytes ==> co 3 cach lay ra gia tri cua cac ki tu thanh 1 mang
        byte [] arrayByte = s.getBytes();
        for(byte b : arrayByte) {
            System.out.println(b);
        }
    }
}
