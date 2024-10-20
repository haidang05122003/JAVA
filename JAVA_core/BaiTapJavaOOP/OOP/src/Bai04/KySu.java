package Bai04;

import java.time.LocalDate;

public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu(String hoTen, LocalDate ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen,ngaySinh, gioiTinh,diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();  // Gọi phương thức lớp cha
        System.out.println("Ngành Đào Tạo: " + nganhDaoTao);
    }
}
