package film;

public class BoPhim {
    private String tenPhim;
    private int namSX;
    private HangSanXuat hangSanXuat;
    private double giaVe;
    private NgayChieu ngayChieu;

    public BoPhim(String tenPhim, int namSX, HangSanXuat hangSanXuat, double giaVe, NgayChieu ngayChieu) {
        this.tenPhim = tenPhim;
        this.namSX = namSX;
        this.hangSanXuat = hangSanXuat;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public NgayChieu getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(NgayChieu ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    public boolean kiemTraGiaVe(BoPhim veKhac) {
        return this.giaVe < veKhac.giaVe;
    }
    public String layTenHangSX() {
        return this.hangSanXuat.getTenHangSX();
    }
    public double sauGiamGiaSX(double x) {
        return this.giaVe - ((x/100) * giaVe);
    }
}
