package bai_tap_kethua_abstract_OOP;

public class HangSanXuat {
    private String TenHangSX;
    private String TenQuocGia;

    public HangSanXuat(String tenQuocGia, String tenHangSX) {
        TenQuocGia = tenQuocGia;
        TenHangSX = tenHangSX;
    }

    public String getTenHangSX() {
        return TenHangSX;
    }

    public void setTenHangSX(String tenHangSX) {
        TenHangSX = tenHangSX;
    }

    public String getTenQuocGia() {
        return TenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        TenQuocGia = tenQuocGia;
    }
}
