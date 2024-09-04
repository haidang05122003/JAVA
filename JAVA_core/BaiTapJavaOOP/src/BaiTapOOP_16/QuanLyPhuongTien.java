package BaiTapOOP_16;

import java.time.LocalDate;
import java.util.ArrayList;

public class QuanLyPhuongTien {
    private ArrayList<PhuongTienGiaoThong> quanLyPhuongTien;

    public QuanLyPhuongTien() {
        this.quanLyPhuongTien = new ArrayList<>();
    }

    public QuanLyPhuongTien(ArrayList<PhuongTienGiaoThong> quanLyPhuongTien) {
        this.quanLyPhuongTien = quanLyPhuongTien;
    }

    public ArrayList<PhuongTienGiaoThong> getQuanLyPhuongTien() {
        return quanLyPhuongTien;
    }

    public void setQuanLyPhuongTien(ArrayList<PhuongTienGiaoThong> quanLyPhuongTien) {
        this.quanLyPhuongTien = quanLyPhuongTien;
    }

    public void themPhuongTien(PhuongTienGiaoThong phuongTienGiaoThong){
        this.quanLyPhuongTien.add(phuongTienGiaoThong);
    }

    public void inPhuongTien(){
        for(PhuongTienGiaoThong phuongTienGiaoThong : quanLyPhuongTien){
            System.out.println(phuongTienGiaoThong);
        }
    }

    public void timLoaiPhuongTienTheoMau(String mau){
        for(PhuongTienGiaoThong phuongTienGiaoThong : quanLyPhuongTien){
            if(phuongTienGiaoThong.getMau().contains(mau)){
                System.out.println("Phương tiện này là :" + phuongTienGiaoThong);
            }
        }
    }

    public void timLoaiPhuongTienTheoNam(LocalDate namSX){
        for(PhuongTienGiaoThong phuongTienGiaoThong : quanLyPhuongTien){
            if(phuongTienGiaoThong.getNamSX().equals(namSX)){
                System.out.println("Phương tiện này là :" + phuongTienGiaoThong);
            }
        }
    }
}
