package ban_ca_phe_OPP;

public class HoaDonCaPhe {
    private String TenLoaiCaPhe;
    private double giaTien;
    private double khoiLuong;

    public HoaDonCaPhe (String TenLoaiCaPhe, double giaTien, double khoiLuong ) {
        this.TenLoaiCaPhe = TenLoaiCaPhe;
        this.giaTien = giaTien;
        this.khoiLuong = khoiLuong;
    }
    public double TongTien() {
        return this.giaTien * this.khoiLuong;
    }
    public boolean kiemTraKhoiLuongLonHon(double khoiLuong) {
        /* if(this.khoiLuong > khoiLuong) {
            return true;
        }
        else {
            return false;
        }
    }*/
        return this.khoiLuong > khoiLuong;
    }
    public boolean kiemTraTongTienLonHon500() {
        return  this.TongTien() > 500000;
    }
    public double giamGia(double x) {
        if(this.TongTien() >500000)
        {
            return (x/100) * this.TongTien();
        }else {
            return 0;
        }
    }
    public double giaSauKhiGiam(double x) {
        return this.TongTien() - this.giamGia(x);
    }
}
