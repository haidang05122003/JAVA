package Bai06;

public class ThiSinhKhoiC extends ThiSinh{
    public ThiSinhKhoiC() {}

    public ThiSinhKhoiC(String soBaoDanh, String hoTen, String diaChi, String uuTienKhuVuc){
        super(soBaoDanh, hoTen, diaChi, uuTienKhuVuc);
    }

    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Khối C thi các môn: Văn, Sử, Địa");
    }
}
