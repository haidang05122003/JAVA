package Bai03;

import java.util.Date;
import java.util.Scanner;

public class HocSinh extends Nguoi{
    private String lop;
    private String khoaHoc;
    private int kyHoc;

    public HocSinh() {}

    public HocSinh(String hoTen, Date ngaySinh, String lop, String khoaHoc){
        super(hoTen, ngaySinh);
        this.lop = lop;
        this.khoaHoc = khoaHoc;
    }

    public HocSinh(String hoTen, String lop, String khoaHoc){
        super(hoTen);
        this.lop = lop;
        this.khoaHoc = khoaHoc;
    }

    public String getLop() {
        return lop;
    }
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.println("Nhập lớp: ");
        lop = sc.nextLine();
        System.out.println("Nhập khóa học: ");
        khoaHoc = sc.nextLine();
        System.out.println("Nhập kỳ học: ");
        kyHoc = sc.nextInt();
        sc.nextLine();
    }

    public void inThongTin() {
        super.inThongTin();
        System.out.println("Lop: " + lop);
        System.out.println("Khoa hoc: " + khoaHoc);
        System.out.println("-------------");
    }
}
