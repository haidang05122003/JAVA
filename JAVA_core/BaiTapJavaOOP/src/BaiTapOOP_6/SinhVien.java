package BaiTapOOP_6;

public class SinhVien extends Nguoi{
    private String maSV;

    public SinhVien() {

    }

    public SinhVien(String hoTen, String ngaySinh, String queQuan, String maSV) {
        super(hoTen, ngaySinh, queQuan);
        this.maSV = maSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", queQuan='" + queQuan + '\'' +
                ", maSV='" + maSV + '\'' +
                '}';
    }
}
