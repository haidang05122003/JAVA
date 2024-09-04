package BaiTapOOP_5;

public class CongNhan extends CanBo {
    private String bac;

    public CongNhan(String hoTen, int ngaySinh, String gioiTinh, String diaChi, String bac) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "hoTen='" + super.getHoTen() + '\'' +
                ", ngaySinh=" + super.getNgaySinh() +
                ", gioiTinh='" + super.getGioiTinh() + '\'' +
                ", diaChi='" + super.getDiaChi() + '\'' +
                ", Bac='" + bac + '\'' +
                '}';
    }
}
