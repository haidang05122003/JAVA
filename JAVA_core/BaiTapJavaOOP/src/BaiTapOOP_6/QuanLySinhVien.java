package BaiTapOOP_6;

import java.util.ArrayList;

public class QuanLySinhVien {
    private ArrayList<Nguoi>quanLySinhVien;

    public QuanLySinhVien() {
        this.quanLySinhVien = new ArrayList<>();
    }

    public QuanLySinhVien(ArrayList<Nguoi> quanLySinhVien) {
        this.quanLySinhVien = quanLySinhVien;
    }

    public ArrayList<Nguoi> getQuanLySinhVien() {
        return quanLySinhVien;
    }

    public void setQuanLySinhVien(ArrayList<Nguoi> quanLySinhVien) {
        this.quanLySinhVien = quanLySinhVien;
    }

    public void themSinhVien(Nguoi nguoi) {
        this.quanLySinhVien.add(nguoi);
    }

    public void inSinhVien() {
        for (Nguoi nguoi : this.quanLySinhVien) {
            System.out.println(nguoi);
        }
    }

    public void timTheoMaSinhVien(){
        for(Nguoi nguoi : quanLySinhVien){
            if(nguoi instanceof SinhVien){
                SinhVien sinhVien = (SinhVien)nguoi;
                if(sinhVien.getMaSV().equalsIgnoreCase("659327")){
                    System.out.println(sinhVien);
                }
            }
        }
    }

}
