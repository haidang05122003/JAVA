package baiTapOOP_7;

public class Bao extends TaiLieu{
    private String ngayPhatHanh;

    public Bao(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(String maTaiLieu, String tenTaiLieu, int soBanPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, tenTaiLieu, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "maTaiLieu='" + super.getMaTaiLieu()+ '\'' +
                ", tenTaiLieu='" + super.getTenTaiLieu() + '\'' +
                ", soBanPhatHanh=" + super.getSoBanPhatHanh() +
                ", ngayPhatHanh='" + ngayPhatHanh + '\'' +
                '}';
    }
}
