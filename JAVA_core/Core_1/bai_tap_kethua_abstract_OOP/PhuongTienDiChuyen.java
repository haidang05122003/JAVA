package bai_tap_kethua_abstract_OOP;

public abstract class PhuongTienDiChuyen {
    protected String TenLoaiPhuongTien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
        TenLoaiPhuongTien = tenLoaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

    public String getTenLoaiPhuongTien() {
        return TenLoaiPhuongTien;
    }

    public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
        TenLoaiPhuongTien = tenLoaiPhuongTien;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String layTenHangSanXuat() {
        return this.hangSanXuat.getTenHangSX();
    }

    public void BatDau() {
        System.out.println("bat dau.....");
    }

    public void TangToc() {
        System.out.println("Tang toc.....");
    }

    public void DungLai() {
        System.out.println("Dung lai.....");
    }

    public abstract double layVanToc();

}
