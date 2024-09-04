package BaiTapOOP_16;

import java.time.LocalDate;

public class XeTai extends PhuongTienGiaoThong{
    private String trongTai;

    public XeTai() {}

    public XeTai(String trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String hangSX, String mau, LocalDate namSX, int giaBan, String trongTai) {
        super(hangSX, mau, namSX, giaBan);
        this.trongTai = trongTai;
    }

    public String getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(String trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "Xe Tải {" +
                "hangSX='" + getHangSX() + '\'' +
                ", mau='" + getMau() + '\'' +
                ", namSX=" + getNamSX() +
                ", giaBan=" + getGiaBan() +
                ", trongTai='" + trongTai + '\'' +
                '}';
    }
}
