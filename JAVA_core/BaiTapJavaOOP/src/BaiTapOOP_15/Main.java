package BaiTapOOP_15;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MaTran> danhSachMaTran = new ArrayList<>();
        TinhMaTran tinhMaTran = new TinhMaTran(danhSachMaTran);
        int luaChon = 0;

        do{
            System.out.println("** Chọn chức năng ");
            System.out.println("1. Nhập vào ma trận A, B ");
            System.out.println("2. In ra ma trận A, B ");
            System.out.println("3. Tính tổng 2 ma trận ");
            System.out.println("4. Hiệu 2 ma trận ");
            System.out.println("5. Tích 2 ma trận ");
            System.out.println("0. Thoát");
            System.out.print("CHỌN : ");
            luaChon = sc.nextInt();
            sc.nextLine();

            if(luaChon == 1){
                System.out.println(" Nhập vào kích thước của ma trận A: ");
                System.out.println("m1: ");
                int m1 = sc.nextInt();
                sc.nextLine();

                System.out.println("n1: ");
                int n1 = sc.nextInt();
                sc.nextLine();

                int[][] matranA = new int[m1][n1];
                System.out.println("Nhập các phần tử của ma trận A: ");
                for(int i = 0; i < m1; i++){
                    for(int j = 0; j < n1; j++){
                        matranA[i][j] = sc.nextInt();
                    }
                }

                System.out.println(" Nhập vào kích thước của ma trận B: ");
                System.out.println("m2: ");
                int m2 = sc.nextInt();
                sc.nextLine();

                System.out.println("n2: ");
                int n2 = sc.nextInt();
                sc.nextLine();

                int[][] matranB = new int[m2][n2];
                System.out.println("Nhập các phần tử của ma trận A: ");
                for(int i = 0; i < m2; i++){
                    for(int j = 0; j < n2; j++){
                        matranB[i][j] = sc.nextInt();
                    }
                }

                MaTran maTranA = new MaTran(n1,m1,n2,m2,matranA,matranB);
                MaTran maTranB = new MaTran(n1,m1,n2,m2,matranA,matranB);
                tinhMaTran.themMaTran(maTranA,maTranB);
            } else if (luaChon == 2) {
                tinhMaTran.inMaTran();
            }else if (luaChon == 3) {
                tinhMaTran.tongMaTran();
            }else if (luaChon == 4) {
                tinhMaTran.hieuMaTran();
            }else if (luaChon == 5) {
                tinhMaTran.tichMaTran();
            }
        }while(luaChon != 0);
    }
}
