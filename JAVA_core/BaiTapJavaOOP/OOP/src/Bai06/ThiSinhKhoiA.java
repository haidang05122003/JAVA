package Bai06;

public class ThiSinhKhoiA extends ThiSinh{

    public ThiSinhKhoiA(){}

    public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, String uuTienKhuVuc) {
        super(soBaoDanh, hoTen, diaChi, uuTienKhuVuc);
    }

    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Khối A thi các môn: Toán, Lý, Hóa");
    }
}
