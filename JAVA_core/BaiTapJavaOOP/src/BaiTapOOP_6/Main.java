package BaiTapOOP_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyHocSinh quanLyHocSinh = new QuanLyHocSinh();
        QuanLySinhVien quanLySinhVien = new QuanLySinhVien();
        int luaChon = 0;

        do {
            System.out.println("-----------MENU------------");
            System.out.println("1. Quản lý học sinh ");
            System.out.println("2. Quản lý sinh viên");
            System.out.println("0. Thoát");
            System.out.print("** Xin mời lựa chọn: ");
            luaChon = sc.nextInt();
            sc.nextLine();

            if (luaChon == 1) {
                int hocsinh = 0;
                do {
                    System.out.println("1. Nhập vào thông tin học sinh ");
                    System.out.println("2. Hiển thị thông tin học sinh ");
                    System.out.println("3. Hiển thị học sinh sinh năm 1985 và quê Thái Nguyên ");
                    System.out.println("4. Hiển thị học sinh học lớp 10A1 ");
                    System.out.println("0. Quay lại menu chính");
                    System.out.print("****** Xin mời lựa chọn: ");
                    hocsinh = sc.nextInt();
                    sc.nextLine();

                    if (hocsinh == 1) {
                        System.out.println("Nhập vào họ tên: ");
                        String hoTen = sc.nextLine();
                        System.out.println("Nhập vào năm sinh (VD: 1985-01-01): ");
                        String ngaySinh = sc.nextLine();
                        System.out.println("Nhập vào quê quán: ");
                        String queQuan = sc.nextLine();
                        System.out.println("Nhập vào lớp: ");
                        String lop = sc.nextLine();
                        System.out.println("Nhập vào khóa học: ");
                        String khoaHoc = sc.nextLine();
                        System.out.println("Nhập vào kỳ học: ");
                        String kiHoc = sc.nextLine();
                        HocSinh hocSinh = new HocSinh(hoTen, ngaySinh, queQuan, lop, khoaHoc, kiHoc);
                        quanLyHocSinh.themHocSinh(hocSinh);
                    } else if (hocsinh == 2) {
                        quanLyHocSinh.inHocSinh();
                    } else if (hocsinh == 3) {
                        quanLyHocSinh.timHocSinhTheoNamVaQue("1985", "Thái Nguyên");
                    } else if (hocsinh == 4) {
                        quanLyHocSinh.timHocSinhTheoLop();
                    } else if (hocsinh != 0) {
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    }
                } while (hocsinh != 0);
            } else if (luaChon == 2) {
                int sinhvien = 0;
                do {
                    System.out.println("1. Nhập vào thông tin sinh viên ");
                    System.out.println("2. Hiển thị thông tin sinh viên");
                    System.out.println("3. Hiển thị sinh viên có mã sinh viên: 659327 ");
                    System.out.println("0. Quay lại menu chính");
                    System.out.print("****** Xin mời lựa chọn: ");
                    sinhvien = sc.nextInt();
                    sc.nextLine();

                    if(sinhvien == 1) {
                        System.out.println("Nhập vào họ tên: ");
                        String hoTen = sc.nextLine();
                        System.out.println("Nhập vào mã sinh viên: ");
                        String maSV = sc.nextLine();
                        System.out.println("Nhập vào năm sinh (VD: 1985-01-01): ");
                        String ngaySinh = sc.nextLine();
                        System.out.println("Nhập vào quê quán: ");
                        String queQuan = sc.nextLine();
                        SinhVien sinhVien = new SinhVien(hoTen, ngaySinh, queQuan, maSV);
                        quanLySinhVien.themSinhVien(sinhVien);
                    }else if (sinhvien == 2) {
                        quanLySinhVien.inSinhVien();
                    }else if(sinhvien == 3) {
                        quanLySinhVien.timTheoMaSinhVien();
                    }
                }while (sinhvien != 0);
            } else if (luaChon != 0) {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (luaChon != 0);

        System.out.println("Chương trình đã kết thúc.");
        sc.close();
    }
}
