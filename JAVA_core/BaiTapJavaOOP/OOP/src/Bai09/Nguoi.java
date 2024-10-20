package Bai09;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Nguoi {
    private String hoTen;
    private LocalDate ngaySinh;
    private String queQuan;

    public Nguoi() {}

    public Nguoi(String hoTen, String ngaySinh, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = LocalDate.parse(ngaySinh, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.queQuan = queQuan;
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

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String toString() {
        return  " Họ tên ='" + hoTen + '\'' +
                ", Ngày sinh =" + ngaySinh +
                ", Quê quán ='" + queQuan + '\'';
    }
}
