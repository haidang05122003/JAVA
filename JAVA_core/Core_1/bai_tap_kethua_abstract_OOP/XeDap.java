package bai_tap_kethua_abstract_OOP;

public class XeDap extends PhuongTienDiChuyen{

    public XeDap( HangSanXuat hangSanXuat) {
        super("XeDap", hangSanXuat);
    }

    @Override
    public double layVanToc() {
        return 20;
    }
}
