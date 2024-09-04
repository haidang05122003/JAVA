package BaiTapOOP_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyVanBan quanLyVanBan = new QuanLyVanBan();

        int luaChon = 0;
        do{
            System.out.println("-----MENU------ ");
            System.out.println("1. Nhập thông tin văn bản ");
            System.out.println("2. In thông tin văn bản ");
            System.out.println("3. Đếm số từ trong xâu ");
            System.out.println("4. Đếm số kí tự H có trong xâu ");
            System.out.println("5. Chuẩn hóa 1 xâu ");
            System.out.println("0. Thoát khỏi chương trình ");
            System.out.print("**** Chọn chức năng: ");
            luaChon = sc.nextInt();
            sc.nextLine();

            if(luaChon == 1){
                System.out.println(" Nhập tên văn bản:  ");
                String tenVanBan = sc.nextLine();

                System.out.println(" Nhập nội dung văn bản:  ");
                String noiDungVanBan = sc.nextLine();

                VanBan vanBan = new VanBan(tenVanBan, noiDungVanBan);
                quanLyVanBan.themVanBan(vanBan);
            } else if (luaChon == 2) {
                quanLyVanBan.inRaVanBan();
            } else if (luaChon == 3) {
                System.out.println("Nhập vào tên văn bản: ");
                String tenVanBan = sc.nextLine();
                quanLyVanBan.demSoTuTrongXau(tenVanBan);
            }else if (luaChon == 4) {
                System.out.println("Nhập vào tên văn bản: ");
                String tenVanBan = sc.nextLine();
                quanLyVanBan.demSoKyTuH(tenVanBan);
            } else if (luaChon == 5) {
                System.out.println("Nhập vào tên văn bản: ");
                String tenVanBan = sc.nextLine();
                quanLyVanBan.chuanHoaXau(tenVanBan);
            }
        }while (luaChon != 0);
    }
}
