package BaiTapOOP_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyMon quanLyMon = new QuanLyMon();
        TuyenSinh tuyenSinh = new TuyenSinh();

        int luaChon = 0;
        do {
            System.out.println("----------MENU----------");
            System.out.println("1. Nhập vào thông tin thí sinh");
            System.out.println("2. In ra màn hình thí sinh");
            System.out.println("3. Tìm kiếm thí sinh theo mã sinh viên");
            System.out.println("0. Thoát chương trình");
            System.out.print("******* XIN MỜI NHẬP: ");
            luaChon = sc.nextInt();
            sc.nextLine();

            if (luaChon == 1) {
                int chonKhoi = 0;
                do {
                    System.out.println("1. Nhập vào số báo danh: ");
                    String SBD = sc.nextLine();
                    System.out.println("2. Nhập vào họ tên: ");
                    String hoTen = sc.nextLine();
                    System.out.println("3. Nhập vào địa chỉ: ");
                    String diaChi = sc.nextLine();
                    System.out.println("4. Nhập vào khu vực được ưu tiên: ");
                    String uuTien = sc.nextLine();

                    System.out.println("Chọn khối thi");
                    System.out.println("5. Khối A");
                    System.out.println("6. Khối B");
                    System.out.println("7. Khối C");
                    System.out.print("Lựa chọn: ");
                    chonKhoi = sc.nextInt();
                    sc.nextLine();

                    ThongTin thongTin = new ThongTin(SBD, hoTen, diaChi, uuTien);
                    tuyenSinh.themThongThi(thongTin);

                    if (chonKhoi == 5) {
                        quanLyMon.themKhoiThi(new MonThi("Toán"));
                        quanLyMon.themKhoiThi(new MonThi("Lý"));
                        quanLyMon.themKhoiThi(new MonThi("Hóa"));
                    } else if (chonKhoi == 6) {
                        quanLyMon.themKhoiThi(new MonThi("Toán"));
                        quanLyMon.themKhoiThi(new MonThi("Sinh"));
                        quanLyMon.themKhoiThi(new MonThi("Hóa"));
                    } else if (chonKhoi == 7) {
                        quanLyMon.themKhoiThi(new MonThi("Văn"));
                        quanLyMon.themKhoiThi(new MonThi("Sử"));
                        quanLyMon.themKhoiThi(new MonThi("Địa"));
                    } else {
                        System.out.println("Khối thi không hợp lệ");
                    }
                } while (chonKhoi < 5 || chonKhoi > 7);

            } else if (luaChon == 2) {
                tuyenSinh.inThongTin();
                quanLyMon.inKhoiThi();
            } else if (luaChon == 3) {
                System.out.println("Nhập vào số báo danh để tìm kiếm: ");
                String SBD = sc.nextLine();
                tuyenSinh.timKiemTheoSBD(SBD);
            }

        } while (luaChon != 0);
    }
}
