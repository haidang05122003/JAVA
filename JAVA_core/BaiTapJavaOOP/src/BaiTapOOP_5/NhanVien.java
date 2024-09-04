package BaiTapOOP_5;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien(String hoTen, int ngaySinh, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }


    @Override
    public String toString() {
        return "KySu{" +
                "hoTen='" + super.getHoTen() + '\'' +
                ", ngaySinh=" + super.getNgaySinh() +
                ", gioiTinh='" + super.getGioiTinh() + '\'' +
                ", diaChi='" + super.getDiaChi() + '\'' +
                "congViec='" + congViec + '\'' +
                '}';
    }
}
