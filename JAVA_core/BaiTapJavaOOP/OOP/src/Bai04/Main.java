package Bai04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        Scanner scanner = new Scanner(System.in);

        quanLyCanBo.themCanBo(new CongNhan("Nguyen Van A", LocalDate.of(1990, 5, 20), "Nam", "Hanoi", "4/7"));
        quanLyCanBo.themCanBo(new KySu("Le Thi B", LocalDate.of(1985, 3, 15), "Nữ", "Hanoi", "Công nghệ thông tin"));
        quanLyCanBo.themCanBo(new NhanVien("Tran Van C", LocalDate.of(1992, 7, 8), "Nam", "Hanoi", "Bảo vệ"));

        System.out.println("Nhập họ tên cán bộ cần tìm :");
        String hoTen = scanner.nextLine();
        CanBo canBo = quanLyCanBo.timKiemCanBo(hoTen);
        quanLyCanBo.hienThiThongTin(canBo);

        scanner.close();
    }
}
