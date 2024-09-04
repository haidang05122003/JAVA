package bai_tap_kethua_abstract_OOP;

public class MayBay extends PhuongTienDiChuyen {
    protected String loaiNhienLieu;

    public MayBay( HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super("MayBay", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 1200;
    }

    public void catCanh() {
        System.out.println("Dang cat canh.....");
    }

    public void haCanh() {
        System.out.println("Dang ha canh.....");
    }


}
