package Bai07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KhuPho quanLyKhuPho = new KhuPho();
        Scanner scanner = new Scanner(System.in);

        //nhap thong tin ho dan
        quanLyKhuPho.nhapThongTinHoDan();

        //hien thi toan bo thong tin ho dan
        quanLyKhuPho.hienThiToanBoHoDan();

        //hien thi ho dan co nguoi mung thuong tho
        quanLyKhuPho.hienThiHoDanCoNguoiThuongTho();
    }
}
