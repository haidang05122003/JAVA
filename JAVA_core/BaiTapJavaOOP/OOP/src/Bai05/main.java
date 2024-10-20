package Bai05;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        QuanLyTaiLieu quanLyTaiLieu = new QuanLyTaiLieu();
        Scanner scanner = new Scanner(System.in);

        quanLyTaiLieu.themTaiLieu(new Sach("SACH01", "Nhà xuất bản giáo dục",5,"Nguyễn Văn A","100"));
        quanLyTaiLieu.themTaiLieu(new TapChi("TAPCHI01","Tạp chí kim đồng", 10, 001,"Tháng 1"));
        quanLyTaiLieu.themTaiLieu(new Bao("BAO01","Báo Quân Đội",15,"Ngày 15 tháng 12 năm 2023"));

        System.out.print("Nhập mã tài liệu cần tìm kiếm: ");
        String maTaiLieu = scanner.nextLine();
        TaiLieu taiLieu = quanLyTaiLieu.timTaiLieu(maTaiLieu);
        quanLyTaiLieu.hienThiTimKiem(taiLieu);

        scanner.close();
    }
}
