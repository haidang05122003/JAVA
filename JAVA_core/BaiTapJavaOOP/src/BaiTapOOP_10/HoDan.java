package BaiTapOOP_10;

import java.time.LocalDate;
import java.util.ArrayList;


public class HoDan {
    private int soNha;
    private ArrayList<Nguoi> thanhVien;

    public HoDan(int soNha) {
        this.soNha = soNha;
        this.thanhVien = new ArrayList<>();
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public ArrayList<Nguoi> getThanhVien() {
        return thanhVien;
    }

    public void themNguoi(Nguoi nguoi) {
        this.thanhVien.add(nguoi);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HoDan{ soNha=").append(soNha).append(", thanhVien=[");
        for (Nguoi nguoi : thanhVien) {
            sb.append("\n\t").append(nguoi);
        }
        sb.append("\n]}");
        return sb.toString();
    }
}
