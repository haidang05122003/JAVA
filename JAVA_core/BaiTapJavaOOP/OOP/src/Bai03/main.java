package Bai03;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        QuanLyNhanSu quanLyNhanSu = new QuanLyNhanSu();
        Scanner sc = new Scanner(System.in);
        quanLyNhanSu.nhapDanhSach(sc);
        quanLyNhanSu.inDanhSach();
        quanLyNhanSu.timkiemTheoMaSinhVien("6651304");
    }
}
