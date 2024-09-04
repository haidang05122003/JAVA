package BaiTapOOP_9;

import java.util.ArrayList;

public class QuanLyKhachSan {
    private ArrayList<Nguoi>quanLyKhachSan;

    public QuanLyKhachSan() {
        this.quanLyKhachSan = new ArrayList<>();
    }

    public QuanLyKhachSan(ArrayList<Nguoi> quanLyKhachSan) {
        this.quanLyKhachSan = quanLyKhachSan;
    }

    public ArrayList<Nguoi> getQuanLyKhachSan() {
        return quanLyKhachSan;
    }

    public void setQuanLyKhachSan(ArrayList<Nguoi> quanLyKhachSan) {
        this.quanLyKhachSan = quanLyKhachSan;
    }

    public void themKhachTro(Nguoi nguoi) {
        this.quanLyKhachSan.add(nguoi);
    }

    public void inKhachTro(){
        for(Nguoi nguoi : quanLyKhachSan){
            if(nguoi instanceof KhachSan){
                KhachSan khachSan = (KhachSan)nguoi;
                System.out.println(khachSan);
            }
        }
    }

    public boolean xoaMotKhachTro(Nguoi nguoi) {
        return this.quanLyKhachSan.remove(nguoi);
    }

    public double tienPhaiTra(int CMND) {
        for (Nguoi nguoi : quanLyKhachSan){
               if(nguoi instanceof KhachSan){
                   KhachSan khachSan = (KhachSan)nguoi;
                   if(khachSan.getSoCMND() == CMND){
                       System.out.println("Tổng tiền là: "+khachSan.getSoNgayTro() * khachSan.getGiaPhong());
                   }
               }
        }
        return 0;
    }


}




