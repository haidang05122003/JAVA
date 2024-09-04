package GhiDoiTuongXuongFile_File;

import java.io.*;
import java.util.ArrayList;
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

    public void ghiDuLieuXuongFile(File file){
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            for(SinhVien sinhVien : this.danhSachSinhVien) {
                oos.writeObject(sinhVien);
            }

            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void docDuLieuTuFile(File file) {
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            SinhVien sinhVien = null;
            while (true){
                Object oj = ois.readObject();
                if(oj == null){
                    break;
                }
                if(oj != null){
                    sinhVien = (SinhVien) oj;
                    this.danhSachSinhVien.add(sinhVien);
                }
            }
        ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
