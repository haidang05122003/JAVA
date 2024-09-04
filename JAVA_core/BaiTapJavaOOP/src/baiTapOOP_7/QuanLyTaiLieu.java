package baiTapOOP_7;

import java.util.ArrayList;

public class QuanLyTaiLieu {
    private ArrayList<TaiLieu>quanLyTaiLieu;

    public QuanLyTaiLieu() {
        this.quanLyTaiLieu = new ArrayList<>();
    }

    public QuanLyTaiLieu(ArrayList<TaiLieu> quanLyTaiLieu) {
        this.quanLyTaiLieu = quanLyTaiLieu;
    }

    public ArrayList<TaiLieu> getQuanLyTaiLieu() {
        return quanLyTaiLieu;
    }

    public void setQuanLyTaiLieu(ArrayList<TaiLieu> quanLyTaiLieu) {
        this.quanLyTaiLieu = quanLyTaiLieu;
    }

    public void themTaiLieu(TaiLieu taiLieu){
        this.quanLyTaiLieu.add(taiLieu);
    }

    public void inTaiLieu(){
        for(TaiLieu taiLieu : quanLyTaiLieu){
            System.out.println(taiLieu);
        }
    }

    public void timSach(){
        for(TaiLieu taiLieu : quanLyTaiLieu){
            if(taiLieu instanceof Sach ){
                Sach sach = (Sach)taiLieu;
                System.out.println(sach);
            }
        }
    }

    public void timTapChi(){
        for(TaiLieu taiLieu : quanLyTaiLieu){
            if(taiLieu instanceof TapChi ){
                TapChi tapChi = (TapChi) taiLieu;
                System.out.println(tapChi);
            }
        }
    }

    public void timBao(){
        for(TaiLieu taiLieu : quanLyTaiLieu){
            if(taiLieu instanceof Bao ){
                Bao bao = (Bao)taiLieu;
                System.out.println(bao);
            }
        }
    }
}
