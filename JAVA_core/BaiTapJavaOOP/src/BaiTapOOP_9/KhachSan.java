package BaiTapOOP_9;

public class KhachSan extends Nguoi{
    private int soNgayTro;
    private String loaiPhongTro;
    private int giaPhong;

    public KhachSan(String hoTen, String ngaySinh, int soCMND, int soNgayTro, String loaiPhongTro, int giaPhong) {
        super(hoTen, ngaySinh, soCMND);
        this.soNgayTro = soNgayTro;
        this.loaiPhongTro = loaiPhongTro;
        this.giaPhong = giaPhong;
    }

    public int getSoNgayTro() {
        return soNgayTro;
    }

    public void setSoNgayTro(int soNgayTro) {
        this.soNgayTro = soNgayTro;
    }

    public String getLoaiPhongTro() {
        return loaiPhongTro;
    }

    public void setLoaiPhongTro(String loaiPhongTro) {
        this.loaiPhongTro = loaiPhongTro;
    }

    public int getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(int giaPhong) {
        this.giaPhong = giaPhong;
    }


    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + getHoTen() + '\'' +
                ", ngaySinh='" + getNgaySinh() + '\'' +
                ", soCMND=" + getSoCMND() +
                ", soNgayTro=" + soNgayTro +
                ", loaiPhongTro='" + loaiPhongTro + '\'' +
                ", giaPhong=" + giaPhong + '}';
    }

}
