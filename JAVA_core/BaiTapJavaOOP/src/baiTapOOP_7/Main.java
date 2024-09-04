package baiTapOOP_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyTaiLieu quanLyTaiLieu = new QuanLyTaiLieu();

        int luaChon = 0;
        do{
            System.out.println("-----------MENU----------");
            System.out.println("1. Nhập vào thông tin tài liêu ");
            System.out.println("2. Hiện thị thông tin các tài liệu ");
            System.out.println("3. Hiện thị sách ");
            System.out.println("4. Hiện thị tạp chí ");
            System.out.println("5. Hiện thị báo  ");
            System.out.println("0. Exit");
            System.out.print("******* XIN MOI BAN NHAP : ");
            luaChon = sc.nextInt();
            sc.nextLine();

            if(luaChon == 1){
                int loaiTaiLieu = 0;
                do{
                    System.out.println("1. Nhập vào mã tài liêu: ");
                    String maTaiLieu = sc.nextLine();
                    System.out.println("2. Nhập vào tên tài liêu: ");
                    String tenTaiLieu = sc.nextLine();
                    System.out.println("3. Nhập vào số bản phát hành tài liệu: ");
                    int soBanPhatHanh = sc.nextInt();

                    System.out.println("Chon loại tài liệu:");
                    System.out.println("4. Sách ");
                    System.out.println("5. Tạp chí");
                    System.out.println("6. Báo");
                    System.out.print("Lựa Chọn: ");
                    loaiTaiLieu = sc.nextInt();
                    sc.nextLine();
                if(loaiTaiLieu == 4){
                    System.out.print("Nhập vào tên tác giả: ");
                    String tacGia = sc.nextLine();
                    System.out.print("Nhập vào số trang: ");
                    int soTrang = sc.nextInt();
                    Sach sach = new Sach(maTaiLieu, tenTaiLieu, soBanPhatHanh, tenTaiLieu, soTrang);
                    quanLyTaiLieu.themTaiLieu(sach);
                }else if(loaiTaiLieu == 5){
                    System.out.print("Nhập vào số phát hành: ");
                    int soPhatHanh = sc.nextInt();
                    System.out.print("Nhập vào tháng phát hành: ");
                    String thangPhatHanh = sc.nextLine();
                    TapChi tapChi = new TapChi(maTaiLieu, tenTaiLieu,soBanPhatHanh, soPhatHanh, thangPhatHanh);
                    quanLyTaiLieu.themTaiLieu(tapChi);
                }else if(loaiTaiLieu == 6){
                    System.out.print("Nhập vào ngày phát hành: ");
                    String ngayPhatHanh = sc.nextLine();
                    Bao bao = new Bao(maTaiLieu, tenTaiLieu,soBanPhatHanh,ngayPhatHanh);
                    quanLyTaiLieu.themTaiLieu(bao);
                }else{
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                }
                }while (loaiTaiLieu < 4 || loaiTaiLieu > 6);
            }else if(luaChon == 2){
                quanLyTaiLieu.inTaiLieu();
            } else if (luaChon == 3) {
                quanLyTaiLieu.timSach();
            }else if (luaChon == 4) {
                quanLyTaiLieu.timTapChi();
            }else if (luaChon == 5) {
                quanLyTaiLieu.timBao();
            }
        }while(luaChon != 0);
    }
}
