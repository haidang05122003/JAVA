package Bai04;

import java.time.LocalDate;

public class CongNhan extends CanBo{
    private String bac;

    public CongNhan(String hoTen, LocalDate ngaySinh, String gioiTinh, String diaChi, String bac) {
        super(hoTen,ngaySinh, gioiTinh,diaChi);
        this.bac = bac;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();  // Gọi phương thức lớp cha
        System.out.println("Bậc: " + bac);
    }
}
