package Bai08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyKhachSan quanLyKhachSan = new QuanLyKhachSan();
        Scanner sc = new Scanner(System.in);

        quanLyKhachSan.nhapThongTinKhachTro();

        System.out.println("Thông tin toàn bộ khách trọ: ");
        quanLyKhachSan.HienThiToanBo();

        System.out.print("Nhập thông tin về CMT/CMND cần tính tiền: ");
        int soChungMinhThu = sc.nextInt();
        sc.nextLine();
        System.out.print("Số tiền mà khách cần trả là : "+ quanLyKhachSan.tinhTienTro(soChungMinhThu));

        sc.close();
    }
}
