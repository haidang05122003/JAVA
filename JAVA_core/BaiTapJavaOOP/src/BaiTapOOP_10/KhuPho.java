package BaiTapOOP_10;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class KhuPho {
    private ArrayList<HoDan> quanLyKhuPho;

    public KhuPho() {
        this.quanLyKhuPho = new ArrayList<>();
    }

    public KhuPho(ArrayList<HoDan> quanLyKhuPho) {
        this.quanLyKhuPho = quanLyKhuPho;
    }

    public ArrayList<HoDan> getQuanLyKhuPho() {
        return quanLyKhuPho;
    }

    public void themHoDan(HoDan hoDan) {
        this.quanLyKhuPho.add(hoDan);
    }

    public void inRaHoDan() {
        for (HoDan hoDan : quanLyKhuPho) {
            System.out.println(hoDan);
        }
    }

    public void inThongTinMungTho() {
        LocalDate now = LocalDate.now();
        for (HoDan hoDan : quanLyKhuPho) {
            for (Nguoi nguoi : hoDan.getThanhVien()) {
                Period age = Period.between(nguoi.getNgaySinh(), now);
                if (age.getYears() >= 80) {
                    System.out.println("Mừng thọ cho cụ: " + nguoi);
                }
            }
        }
    }
}
