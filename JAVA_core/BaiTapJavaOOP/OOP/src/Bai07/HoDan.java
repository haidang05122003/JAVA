package Bai07;

import java.util.ArrayList;
import java.util.List;

public class HoDan {
    private String soNha;
    private List<Nguoi> thanhVien;

    public HoDan(String soNha) {
        this.soNha = soNha;
        this.thanhVien = new ArrayList<Nguoi>();
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public List<Nguoi> getThanhVien() {
        return thanhVien;
    }

    public void setThanhVien(List<Nguoi> thanhVien) {
        this.thanhVien = thanhVien;
    }

    public void themThanhVien(Nguoi nguoi){
        this.thanhVien.add(nguoi);
    }

    public void hienThiThongTin(){
        System.out.println("Số nhà: " +soNha);
        System.out.println("Danh sách thành viên: ");
        for(Nguoi nguoi : thanhVien){
            nguoi.hienThiThongTin();
            System.out.println("--------------------------");
        }
    }

    public boolean coThanhVienHuongTho(){
        for(Nguoi nguoi : thanhVien){
            if(nguoi.thuongTho()){
                return true;
            }
        }
        return false;
    }
}
