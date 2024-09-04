package BaiTapOOP_13;

public class KhachHang {
    private String hoTen;
    private int soNha;
    private int maSoCongTo;

    public KhachHang() {}

    public KhachHang(String hoTen, int soNha, int maSoCongTo) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.maSoCongTo = maSoCongTo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public int getMaSoCongTo() {
        return maSoCongTo;
    }

    public void setMaSoCongTo(int maSoCongTo) {
        this.maSoCongTo = maSoCongTo;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "hoTen='" + hoTen + '\'' +
                ", soNha=" + soNha +
                ", maSoCongTo=" + maSoCongTo +
                '}';
    }
}
