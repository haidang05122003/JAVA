package BaiTapOOP_12;

import java.time.LocalDate;

public class TheMuon extends SinhVien{
    private int soPhieuMuon;
    private LocalDate ngayMuon;
    private LocalDate hanTra;
    private String soHieuSach;

    public TheMuon() {}

    public TheMuon(int soPhieuMuon, LocalDate ngayMuon, LocalDate hanTra, String soHieuSach) {
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
    }

    public TheMuon(String name, String id, LocalDate date, String lop, int soPhieuMuon, LocalDate ngayMuon, LocalDate hanTra, String soHieuSach) {
        super(name, id, date, lop);
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
    }

    public int getSoPhieuMuon() {
        return soPhieuMuon;
    }

    public void setSoPhieuMuon(int soPhieuMuon) {
        this.soPhieuMuon = soPhieuMuon;
    }

    public LocalDate getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(LocalDate ngayTra) {
        this.ngayMuon = ngayTra;
    }

    public LocalDate getHanTra() {
        return hanTra;
    }

    public void setHanTra(LocalDate hanTra) {
        this.hanTra = hanTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    @Override
    public String toString() {
        return "THẺ MƯỢN SÁCH {" +
                "TÊN ='" + getName() + '\'' +
                ", MSV ='" + getId() + '\'' +
                ", NĂM SINH =" + getDate() +
                ", LỚP ='" + getLop() + '\'' +
                ", SỐ PHIẾU MƯỢN =" + soPhieuMuon +
                ", NGÀY TRẢ =" + ngayMuon +
                ", HẠN TRẢ =" + hanTra +
                ", SỐ HIỆU SÁCH =" + soHieuSach +
                '}';
    }
}
