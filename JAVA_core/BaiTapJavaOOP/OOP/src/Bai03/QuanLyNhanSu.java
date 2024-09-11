package Bai03;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanSu {
    private ArrayList<Nguoi> quanLyNhanSu;

    public QuanLyNhanSu() {
        this.quanLyNhanSu = new ArrayList<>();
    }

    public void themNhanSu(Nguoi ns){
        quanLyNhanSu.add(ns);
    }

    public void nhapDanhSach(Scanner sc) {
        System.out.print("Nhập số nhân sự n = ");
        while (!sc.hasNextInt()) {
            System.out.println("Vui lòng nhập một số hợp lệ.");
            sc.next();
        }
        int n = sc.nextInt();
        sc.nextLine();

        int chon = 0;
        Nguoi ns = null;
        for(int i = 0; i<n; i++) {
            System.out.print("Chọn loại nhân sự muốn nhập (0: HocSinh, 1: SinhVien): ");
            while (!sc.hasNextInt()) {
                System.out.println("Vui lòng nhập 0 (HocSinh) hoặc 1 (SinhVien).");
                sc.next();
            }
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 0:
                    ns = new HocSinh();
                    break;
                case 1:
                    ns = new SinhVien();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập 0 (HocSinh) hoặc 1 (SinhVien).");
                    i--; // Lặp lại
                    continue;
            }
            ns.nhapThongTin(sc);
            themNhanSu(ns);
        }
    }

    public void inDanhSach(){
        for(Nguoi ns : quanLyNhanSu){
            ns.inThongTin();
        }
    }

    public void timkiemTheoMaSinhVien(String msv){
        boolean found = false;
        for(Nguoi ns : quanLyNhanSu){
            if(ns instanceof SinhVien){
                SinhVien sv = (SinhVien) ns;
                if(msv.equals(sv.getMsv())) {
                    sv.inThongTin();
                    found = true;
                    break;
                }
            }
        }
        if(!found) {
            System.out.println("Không tìm thấy sinh viên với mã: " + msv);
        }
    }
}
