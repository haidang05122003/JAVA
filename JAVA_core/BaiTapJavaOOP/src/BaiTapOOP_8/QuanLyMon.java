package BaiTapOOP_8;

import java.util.ArrayList;

public class QuanLyMon {
    private ArrayList<MonThi>quanLyMon;

    public QuanLyMon() {
        this.quanLyMon = new ArrayList<>();
    }

    public QuanLyMon(ArrayList<MonThi> quanLyMon) {
        this.quanLyMon = quanLyMon;
    }

    public ArrayList<MonThi> getQuanLyMon() {
        return quanLyMon;
    }

    public void setQuanLyMon(ArrayList<MonThi> quanLyMon) {
        this.quanLyMon = quanLyMon;
    }

    public void themKhoiThi(MonThi monThi) {
        this.quanLyMon.add(monThi);
    }

    public void inKhoiThi(){
        for(MonThi monThi : quanLyMon){
            System.out.println(monThi);
        }
    }
}
