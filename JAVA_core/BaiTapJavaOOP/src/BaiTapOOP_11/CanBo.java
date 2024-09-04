package BaiTapOOP_11;

import java.time.LocalDate;

public class CanBo extends Nguoi {
    private double luongCung, thuong, phat, luongThucLinh;

    public CanBo(String hoTen, LocalDate ngaySinh, String queQuan, double luongCung, double thuong, double phat, double luongThucLinh) {
        super(hoTen, ngaySinh, queQuan);
        this.luongCung = luongCung;
        this.thuong = thuong;
        this.phat = phat;
        this.luongThucLinh = luongThucLinh;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getThuong() {
        return thuong;
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }

    public double getPhat() {
        return phat;
    }

    public void setPhat(double phat) {
        this.phat = phat;
    }

    public double getLuongThucLinh() {
        return luongThucLinh;
    }

    public void setLuongThucLinh(double luongThucLinh) {
        this.luongThucLinh = luongThucLinh;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "hoTen='" + getHoTen() + '\'' +
                ", ngaySinh=" + getNgaySinh() +
                ", queQuan='" + getQueQuan() + '\'' +
                ", luongCung=" + getLuongCung() +
                ", thuong=" + getThuong() +
                ", phat=" + getPhat() +
                ", luongThucLinh=" + getLuongThucLinh() +
                '}';
    }
}
