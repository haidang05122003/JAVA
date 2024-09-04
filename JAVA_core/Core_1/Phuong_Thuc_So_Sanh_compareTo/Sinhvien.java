package Phuong_Thuc_So_Sanh_compareTo;

public class Sinhvien implements Comparable<Sinhvien>{
    private int maSinhVien;
    private String hoVaTen;
    private String tenLop;
    private double diemTrungBinh;

    public Sinhvien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.tenLop = tenLop;
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    /* public String getTen() {
        String s = this.hoVaTen.trim();
        if(s.indexOf(" ") >= 0)
        {
            int vt = s.lastIndexOf(" ");
            return s.substring(vt+1);
        }else {
            return s;
        }
    }

     @Override
    public int compareTo(Sinhvien o) {
        // <0
        // >0
        // =0
        //dua tren so sanh ten
        //Ten: Adam, Trump, Lisbon, Nguyen Van A, Tran Thi Huyen Trang
        String tenThis = this.getTen();
        String ten0 = o.getTen();

        return tenThis.compareTo(ten0);
    } */

    @Override
    public int compareTo(Sinhvien o) {
        if(this.diemTrungBinh < o.diemTrungBinh) {
            return -1;
        }
        if (this.diemTrungBinh > o.diemTrungBinh) {
            return 1;
        }
        return 0;
    }
}
