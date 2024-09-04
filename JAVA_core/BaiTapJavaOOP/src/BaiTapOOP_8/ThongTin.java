package BaiTapOOP_8;

public class ThongTin {
    private String SBD, hoTen, diaChi, uuTien;

    public ThongTin() {

    }

    public ThongTin(String SBD, String hoTen, String diaChi, String uuTien) {
        this.SBD = SBD;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.uuTien = uuTien;
    }

    public String getSBD() {
        return SBD;
    }

    public void setSBD(String SBD) {
        this.SBD = SBD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getUuTien() {
        return uuTien;
    }

    public void setUuTien(String uuTien) {
        this.uuTien = uuTien;
    }

    @Override
    public String toString() {
        return "Thí Sinh{" +
                "SBD='" + SBD + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", uuTien='" + uuTien + '\''
                ;
    }
}
