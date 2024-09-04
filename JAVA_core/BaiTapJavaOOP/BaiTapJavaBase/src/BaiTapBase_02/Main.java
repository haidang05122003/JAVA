package BaiTapBase_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A;
        System.out.println("Enter A String: ");
        A = sc.nextLine();

        int doDai = A.length();
        for(int i = 0; i<doDai; i++ ){
            System.out.println("Vi tri thu "+ i + " la: " +A.charAt(i));
        }
    }
}
