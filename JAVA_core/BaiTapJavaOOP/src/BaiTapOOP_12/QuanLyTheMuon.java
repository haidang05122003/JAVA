package BaiTapOOP_12;


import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class QuanLyTheMuon {
    private ArrayList<SinhVien> quanLyTheMuon;

    public QuanLyTheMuon() {
        this.quanLyTheMuon = new ArrayList<>();
    }

    public QuanLyTheMuon(ArrayList<SinhVien> quanLyTheMuon) {
        this.quanLyTheMuon = quanLyTheMuon;
    }

    public ArrayList<SinhVien> getQuanLyTheMuon() {
        return quanLyTheMuon;
    }

    public void setQuanLyTheMuon(ArrayList<SinhVien> quanLyTheMuon) {
        this.quanLyTheMuon = quanLyTheMuon;
    }

    public void themSinhVien(SinhVien sinhVien){
        this.quanLyTheMuon.add(sinhVien);
    }

    public void inSinhVien(){
        for(SinhVien sinhVien : quanLyTheMuon){
            if(sinhVien instanceof TheMuon){
                TheMuon theMuon = (TheMuon)sinhVien;
                System.out.println(theMuon);
            }
        }
    }

    public void inThongTinTraSach(){
        for(SinhVien sinhVien : quanLyTheMuon){
            if(sinhVien instanceof TheMuon){
                TheMuon theMuon = (TheMuon)sinhVien;
                    System.out.println(" Sinh Viên: " + sinhVien.getName() + " , Số hiệu sách: " +theMuon.getSoHieuSach());
                    System.out.println(" Ngày trả: " + theMuon.getHanTra());
                }
            }
        }
}


