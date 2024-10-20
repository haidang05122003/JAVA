package Bai09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyHocSinh quanLyHocSinh = new QuanLyHocSinh();
        quanLyHocSinh.nhapThongTinHocSinh();

        System.out.println("Thông tin của học sinh: ");
        quanLyHocSinh.hienThiHoSoHocSinh();

        System.out.println("Thông tin của học sinh quê Thái Nguyên và sinh năm 1985 là: ");
        quanLyHocSinh.hienThiHoSoHocSinh("Thái Nguyên");

        System.out.println("Thông tin của học sinh học lớp 10A1: ");
        quanLyHocSinh.hienThiHoSoHocSinhTheoLop("10A1");

    }
}
