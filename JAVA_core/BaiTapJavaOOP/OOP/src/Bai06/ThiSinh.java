package Bai06;

public class ThiSinh {
    private String soBaoDanh;
    private String hoTen;
    private String diaChi;
    private String uuTienKhuVuc;

    public ThiSinh() {}

    public ThiSinh(String soBaoDanh, String hoTen, String diaChi, String uuTienKhuVuc) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.uuTienKhuVuc = uuTienKhuVuc;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(String soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getUuTienKhuVuc() {
        return uuTienKhuVuc;
    }

    public void setUuTienKhuVuc(String uuTienKhuVuc) {
        this.uuTienKhuVuc = uuTienKhuVuc;
    }

    public void hienThiThongTin(){
        System.out.println("Số báo danh: " +soBaoDanh);
        System.out.println("Họ Tên: " +hoTen);
        System.out.println("Địa chỉ: " +diaChi);
        System.out.println("Ưu tiên khu vực: " +uuTienKhuVuc);
    }
}
