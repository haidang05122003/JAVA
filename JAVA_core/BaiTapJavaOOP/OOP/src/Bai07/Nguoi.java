package Bai07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Nguoi {
    private String hoTen;
    private LocalDate ngaySinh;
    private String ngheNghiep;

    public Nguoi() {}

    public Nguoi(String hoTen, String ngaySinh, String ngheNghiep) {
        this.hoTen = hoTen;
        this.ngaySinh = LocalDate.parse(ngaySinh, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.ngheNghiep = ngheNghiep;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public void hienThiThongTin(){
        System.out.println("Họ Tên: "+ hoTen);
        System.out.println("Ngày sinh "+ ngaySinh);
        System.out.println("Nghề nghiệp: "+ ngheNghiep);
    }

    public boolean thuongTho(){
        return LocalDate.now().getYear() - ngaySinh.getYear() >= 80;
    }
}
