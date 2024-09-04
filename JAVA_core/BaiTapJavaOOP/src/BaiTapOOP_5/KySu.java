package BaiTapOOP_5;

public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu(String hoTen, int ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "hoTen='" + super.getHoTen() + '\'' +
                ", ngaySinh=" + super.getNgaySinh() +
                ", gioiTinh='" + super.getGioiTinh() + '\'' +
                ", diaChi='" + super.getDiaChi() + '\'' +
                ", nganhDaoTao='" + nganhDaoTao + '\'' +
                '}';
    }
}
