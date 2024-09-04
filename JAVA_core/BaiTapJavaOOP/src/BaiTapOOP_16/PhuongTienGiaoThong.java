package BaiTapOOP_16;

import java.time.LocalDate;

public class PhuongTienGiaoThong {
    private String hangSX, mau;
    private LocalDate namSX;
    private int giaBan;

    public PhuongTienGiaoThong() {}

    public PhuongTienGiaoThong(String hangSX, String mau, LocalDate namSX, int giaBan) {
        this.hangSX = hangSX;
        this.mau = mau;
        this.namSX = namSX;
        this.giaBan = giaBan;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public LocalDate getNamSX() {
        return namSX;
    }

    public void setNamSX(LocalDate namSX) {
        this.namSX = namSX;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "PhuongTienGiaoThong{" +
                "hangSX='" + hangSX + '\'' +
                ", mau='" + mau + '\'' +
                ", namSX=" + namSX +
                ", giaBan=" + giaBan +
                '}';
    }
}
