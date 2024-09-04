package BaiTapOOP_13;

public class BienLai extends KhachHang{
    private int soCu, soMoi;
    private double soTienTra;

    public BienLai(int soCu, int soMoi, double soTienTra) {
        this.soCu = soCu;
        this.soMoi = soMoi;
        this.soTienTra = soTienTra;
    }

    public BienLai(String hoTen, int soNha, int maSoCongTo, int soCu, int soMoi, double soTienTra) {
        super(hoTen, soNha, maSoCongTo);
        this.soCu = soCu;
        this.soMoi = soMoi;
        this.soTienTra = soTienTra;
    }

    public int getSoCu() {
        return soCu;
    }

    public void setSoCu(int soCu) {
        this.soCu = soCu;
    }

    public int getSoMoi() {
        return soMoi;
    }

    public void setSoMoi(int soMoi) {
        this.soMoi = soMoi;
    }

    public double getSoTienTra() {
        return soTienTra;
    }

    public void setSoTienTra(double soTienTra) {
        this.soTienTra = soTienTra;
    }

    @Override
    public String toString() {
        return "Biên lai {" +
                "Họ Tên ='" + getHoTen() + '\'' +
                ", Số nhà =" + getSoNha() +
                ", Số Công Tơ =" + getMaSoCongTo() +
                ", Số cũ = " + soCu +
                ", Số mới =" + soMoi +
                ", Số tiền trả = "+ soTienTra +
                '}';
    }
}
