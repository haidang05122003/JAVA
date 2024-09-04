package Quan_ly_sinh_vien_OOP;

import java.util.Objects;

public class NgaySinh {
    private int ngay, thang, nam;

    public NgaySinh(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NgaySinh ngaySinh = (NgaySinh) o;
        return getNgay() == ngaySinh.getNgay() && getThang() == ngaySinh.getThang() && getNam() == ngaySinh.getNam();
    }
}
