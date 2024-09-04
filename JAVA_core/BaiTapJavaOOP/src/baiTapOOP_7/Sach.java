package baiTapOOP_7;

public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang;

    public Sach(String tenTacGia, int soTrang) {
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public Sach(String maTaiLieu, String tenTaiLieu, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenTaiLieu, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maTaiLieu='" + super.getMaTaiLieu() + '\'' +
                ", tenTaiLieu='" + super.getTenTaiLieu()+ '\'' +
                ", soPhatHanh=" + super.getSoBanPhatHanh() +
                ", tenTacGia='" + tenTacGia + '\'' +
                '}';
    }

}
