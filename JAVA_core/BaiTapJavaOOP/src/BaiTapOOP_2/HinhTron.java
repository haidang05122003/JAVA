package BaiTapOOP_2;

public class HinhTron{
    private double r;
    private String mau;

    public HinhTron(double r, String mau) {
        this.r = r;
        this.mau = mau;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + r +
                ", mau='" + mau + '\'' +
                '}';
    }
}
