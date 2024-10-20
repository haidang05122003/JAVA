package Bai08;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Nguoi {
    private String hoTen;
    private LocalDate ngaySinh;
    private int soChungMinhThu;

    public Nguoi(){}

    public Nguoi(String hoTen, String ngaySinh, int soChungMinhThu) {
        this.hoTen = hoTen;
        this.ngaySinh = LocalDate.parse(ngaySinh, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.soChungMinhThu = soChungMinhThu;
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

    public int getSoChungMinhThu() {
        return soChungMinhThu;
    }

    public void setSoChungMinhThu(int soChungMinhThu) {
        this.soChungMinhThu = soChungMinhThu;
    }

    public String toString() {
        return  "Khach Tro :" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", soChungMinhThu=" + soChungMinhThu;
    }
}
