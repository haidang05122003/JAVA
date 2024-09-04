package Quan_Ly_sinh_vien_arrayslist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien>danhSachSinhVien;

    public DanhSachSinhVien() {
       this.danhSachSinhVien = new ArrayList<SinhVien>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSachSinhVien) {
        this.danhSachSinhVien = danhSachSinhVien;
    }

    public void themSinhVien(SinhVien sv) {
        this.danhSachSinhVien.add(sv);
    }

    public void inDanhSachSinhVien() {
        for(SinhVien sinhVien : this.danhSachSinhVien) {
            System.out.println(sinhVien);
        }
    }

    public boolean kiemTraDanhSachRong() {
        return this.danhSachSinhVien.isEmpty();
    }

    public int laySoluongSinhVien() {
        return this.danhSachSinhVien.size();
    }

    public void lamRongDanhSachSinhVien() {
        this.danhSachSinhVien.removeAll(danhSachSinhVien);
    }

    public boolean kiemTraTonTai(SinhVien sv) {
        return this.danhSachSinhVien.contains(sv);
    }

    public boolean xoaMotSinhVien(SinhVien sv) {
        return this.danhSachSinhVien.remove(sv);
    }

    public void timSinhVien(String ten) {
        for(SinhVien sinhVien : this.danhSachSinhVien) {
            if(sinhVien.getHoVaTen().indexOf(ten) >= 0) {
                System.out.println(sinhVien);
            }
        }
    }

    public void sapXepSinhVienGiamTheoDiem() {
        Collections.sort(this.danhSachSinhVien, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if(sv1.getDiemTB() < sv2.getDiemTB()) {
                    return 1;
                }else if(sv1.getDiemTB() > sv2.getDiemTB()) {
                    return -1;
                }else
                    return 0;
            }
        } );
    }

}
