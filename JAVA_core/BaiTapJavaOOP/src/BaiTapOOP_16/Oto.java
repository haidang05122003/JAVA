package BaiTapOOP_16;

import java.time.LocalDate;

public class Oto extends PhuongTienGiaoThong{
    private String soCho;
    private String kieuDongCo;

    public Oto() {}

    public Oto(String soCho, String kieuDongCo) {
        this.soCho = soCho;
        this.kieuDongCo = kieuDongCo;
    }

    public Oto(String hangSX, String mau, LocalDate namSX, int giaBan, String soCho, String kieuDongCo) {
        super(hangSX, mau, namSX, giaBan);
        this.soCho = soCho;
        this.kieuDongCo = kieuDongCo;
    }

    public String getSoCho() {
        return soCho;
    }

    public void setSoCho(String soCho) {
        this.soCho = soCho;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    @Override
    public String toString() {
        return "Ô tô {" +
                "hangSX='" + getHangSX() + '\'' +
                ", mau='" + getMau() + '\'' +
                ", namSX=" + getNamSX() +
                ", giaBan=" + getGiaBan() +
                ", soCho='" + soCho + '\'' +
                ", kieuDongco='"+ kieuDongCo +'\''+
                '}';
    }
}
