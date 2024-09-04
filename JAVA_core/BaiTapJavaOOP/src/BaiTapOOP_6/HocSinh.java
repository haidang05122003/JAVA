package BaiTapOOP_6;

import java.util.Date;

public class HocSinh extends Nguoi{
    private String lop;
    private String khoaHoc;
    private String kiHoc;

    public HocSinh() {

    }

    public HocSinh(String hoTen, String ngaySinh, String queQuan, String lop, String khoaHoc, String kiHoc) {
        super(hoTen, ngaySinh, queQuan);
        this.lop = lop;
        this.khoaHoc = khoaHoc;
        this.kiHoc = kiHoc;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public String getKiHoc() {
        return kiHoc;
    }

    public void setKiHoc(String kiHoc) {
        this.kiHoc = kiHoc;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "lop='" + lop + '\'' +
                ", khoaHoc='" + khoaHoc + '\'' +
                ", kiHoc='" + kiHoc + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", queQuan='" + queQuan + '\'' +
                '}';
    }
}
