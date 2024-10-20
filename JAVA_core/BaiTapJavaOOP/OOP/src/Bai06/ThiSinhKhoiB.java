package Bai06;

public class ThiSinhKhoiB extends ThiSinh{

    public ThiSinhKhoiB() {}

    public ThiSinhKhoiB(String soBaoDanh, String hoTen, String diaChi, String uuTienKhuVuc){
        super(soBaoDanh, hoTen, diaChi, uuTienKhuVuc);
    }

    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Khối B thi các môn: Toán, Sinh, Hóa");
    }
}
