package Bai10;

public class CanBoGiaoVien extends Nguoi{
    private double luongCung;
    private double thuong;
    private double phat;

    public CanBoGiaoVien(){}

    public CanBoGiaoVien(String hoTen, String ngaySinh, String queQuan, double luongCung, double thuong, double phat){
        super(hoTen, ngaySinh, queQuan);
        this.luongCung = luongCung;
        this.thuong = thuong;
        this.phat = phat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getThuong() {
        return thuong;
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }

    public double getPhat() {
        return phat;
    }

    public void setPhat(double phat) {
        this.phat = phat;
    }

    public double luongThucLinh(){
        return luongCung + thuong - phat;
    }
    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Lương cứng: " +luongCung);
        System.out.println("Thưởng: " +thuong);
        System.out.println("Phạt: " + phat);
        System.out.println("Lương thực lĩnh: " + luongThucLinh());
    }
}
