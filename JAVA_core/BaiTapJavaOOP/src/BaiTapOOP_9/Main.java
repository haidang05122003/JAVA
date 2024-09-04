package BaiTapOOP_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyKhachSan quanLyKhachSan = new QuanLyKhachSan();
        int luaChon = 0;

        do {
            System.out.println("-------------MENU------------");
            System.out.println("1. Nhập thông tin của khách: ");
            System.out.println("2. Hiện thi thông tin khách hàng");
            System.out.println("3. Xóa Thông tin của 1 khách hàng");
            System.out.println("4. Tính tiền phòng");
            System.out.print("************Chọn chức năng: ");
            luaChon = sc.nextInt();
            sc.nextLine();

            if (luaChon == 1) {
                System.out.println(" Nhập họ tên : ");
                String hoTen = sc.nextLine();
                System.out.println(" Nhập ngày sinh: ");
                String ngaySinh = sc.nextLine();
                System.out.println(" Nhập số CMND: ");
                int soCMND = sc.nextInt();
                sc.nextLine();  // Thêm dòng này để tránh lỗi bỏ qua nhập
                System.out.println(" Nhập loại phòng: ");
                String loaiPhong = sc.nextLine();
                System.out.println(" Nhập giá phòng: ");
                int giaPhong = sc.nextInt();
                System.out.println(" Nhập số ngày trọ: ");
                int ngayTro = sc.nextInt();
                KhachSan khachSan = new KhachSan(hoTen, ngaySinh, soCMND, ngayTro, loaiPhong, giaPhong);
                quanLyKhachSan.themKhachTro(khachSan);
            } else if (luaChon == 2) {
                quanLyKhachSan.inKhachTro();
            } else if (luaChon == 3) {
                System.out.print("Nhập vào số CMND của khách cần xóa: ");
                int soCMND = sc.nextInt();
                boolean daXoa = false;
                // Dùng vòng lặp để tìm và xóa khách hàng
                for (Nguoi nguoi : quanLyKhachSan.getQuanLyKhachSan()) {
                    if (nguoi.getSoCMND() == soCMND) {
                        daXoa = quanLyKhachSan.xoaMotKhachTro(nguoi);
                        break;
                    }
                }
                if (daXoa) {
                    System.out.println("Đã xóa thành công!");
                } else {
                    System.out.println("Không tìm thấy khách hàng với số CMND đã nhập.");
                }
            } else if (luaChon == 4) {
                System.out.println("Nhập vào CMND người cần tính tiền: ");
                int soCMND = sc.nextInt();
                quanLyKhachSan.tienPhaiTra(soCMND);
            }
        } while (luaChon != 0);
    }
}
