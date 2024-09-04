package baiTapOOP_7;

public class TaiLieu {
    private String maTaiLieu;
    private String tenTaiLieu;
    private int soBanPhatHanh;

    public TaiLieu() {

    }

    public TaiLieu(String maTaiLieu, String tenTaiLieu, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenTaiLieu = tenTaiLieu;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenTaiLieu() {
        return tenTaiLieu;
    }

    public void setTenTaiLieu(String tenTaiLieu) {
        this.tenTaiLieu = tenTaiLieu;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "maTaiLieu='" + maTaiLieu + '\'' +
                ", tenTaiLieu='" + tenTaiLieu + '\'' +
                ", soPhatHanh=" + soBanPhatHanh +
                '}';
    }
}
