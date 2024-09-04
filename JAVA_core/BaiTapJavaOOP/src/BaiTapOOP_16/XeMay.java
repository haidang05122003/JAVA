package BaiTapOOP_16;

import java.time.LocalDate;

public class XeMay extends PhuongTienGiaoThong{
    private String congSuat;

    public XeMay() {}

    public XeMay(String congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String hangSX, String mau, LocalDate namSX, int  giaBan, String congSuat) {
        super(hangSX, mau, namSX, giaBan);
        this.congSuat = congSuat;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "Xe Máy {" +
                "hangSX='" + getHangSX() + '\'' +
                ", mau='" + getMau() + '\'' +
                ", namSX=" + getNamSX() +
                ", giaBan=" + getGiaBan() +
                ", congSuat='" + congSuat + '\'' +
                '}';
    }
}
