package Bai03;

import java.util.Date;
import java.util.Scanner;

public class SinhVien extends Nguoi{
    private String msv;

    public SinhVien() {}

    public SinhVien(String hoTen, String msv) {
        super(hoTen);
        this.msv = msv;
    }

    public SinhVien(String hoTen, Date ngaySinh, String queQuan, String msv) {
        super(hoTen, ngaySinh, queQuan);
        this.msv = msv;
    }

    public String getMsv() {
        return msv;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.println("Nhập mã sinh viên: ");
        msv = sc.nextLine(); // Gán giá trị cho msv
    }

    @Override
    public void inThongTin(){
        super.inThongTin();
        System.out.println("Mã SV: " + msv);
        System.out.println("-------------");
    }
}
