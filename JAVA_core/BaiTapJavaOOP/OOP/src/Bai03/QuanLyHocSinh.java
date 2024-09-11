package Bai03;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHocSinh {
    private ArrayList<HocSinh> quanLyHocSinh;

    public QuanLyHocSinh() {
        this.quanLyHocSinh = new ArrayList<>(100);
    }

    public void themHocSinh(HocSinh hs){
        quanLyHocSinh.add(hs);
    }

    public void nhapDanhSach(Scanner sc){
        System.out.print("Nhap so hoc sinh can them n : ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<n; i++){
            HocSinh hs = new HocSinh();
            hs.nhapThongTin(sc);
            themHocSinh(hs);
        }
    }

    public void inDanhSach(){
        for(HocSinh hs : quanLyHocSinh){
            hs.inThongTin();
        }
    }

    public void timKiemHocSinh(int namSinh, String queQuan){
        for(HocSinh hs : quanLyHocSinh){
            if(queQuan.equalsIgnoreCase(hs.getQueQuan()) && (namSinh == hs.getNgaySinh().getYear()+1900)){
                hs.inThongTin();
            }
        }
    }

    public void timKiemHocSinh(String lop){
        for(HocSinh hs : quanLyHocSinh){
            if(lop.equalsIgnoreCase(hs.getLop())){
                hs.inThongTin();
            }
        }
    }
}
