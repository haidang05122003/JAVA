package Quan_ly_sinh_vien_OOP;

public class SinhVien {
    private int maSV;
    private String hoVaTen;
    private NgaySinh ngaySinh;
    private double diemTB;
    private Lop lop;

    public SinhVien(int maSV, String hoVaTen, NgaySinh ngaySinh, double diemTB, Lop lop) {
        this.maSV = maSV;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
        this.lop = lop;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public NgaySinh getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(NgaySinh ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    public String hienThiTenKhoa() {
        return this.lop.getKhoa();
    }

    public String kiemTraDauOfKhong() {
        return diemTB >= 5.0 ? "Sinh vien nay da dau" : "Sinh vien nay da truot";
    }
    public boolean kiemTraNgaySinh(SinhVien ngayKhac) {
        return this.ngaySinh.equals(ngayKhac.ngaySinh);
    }
}
