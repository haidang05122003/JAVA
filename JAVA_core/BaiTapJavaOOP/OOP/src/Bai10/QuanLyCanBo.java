package Bai10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCanBo {
    private List<Nguoi> quanLyCanBo;

    public QuanLyCanBo() {
        quanLyCanBo = new ArrayList<>();
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng cán bộ cần nhập: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            System.out.println("Nhập thông tin cán bộ thứ " + (i + 1) + ":");

            System.out.println("Họ tên: ");
            String hoTen = sc.nextLine();

            System.out.println("Ngày sinh: ");
            String ngaySinh = sc.nextLine();

            System.out.println("Quê quán: ");
            String queQuan = sc.nextLine();

            System.out.println("Lương cứng: ");
            double luongCung = sc.nextDouble();
            sc.nextLine();

            System.out.println("Thưởng: ");
            double thuong = sc.nextDouble();
            sc.nextLine();

            System.out.println("Phạt: ");
            double phat = sc.nextDouble();
            sc.nextLine();

            CanBoGiaoVien canBoGiaoVien = new CanBoGiaoVien(hoTen, ngaySinh, queQuan, luongCung, thuong, phat);
            quanLyCanBo.add(canBoGiaoVien);
        }
    }

    public void hienThiTatCa(){
        if(quanLyCanBo.isEmpty()){
            System.out.println("Không có cán bộ nào trong danh sách.");
        }else{
            System.out.println("Danh sách cán bộ là: ");
            for(Nguoi nguoi : quanLyCanBo){
                if(nguoi instanceof CanBoGiaoVien){
                    CanBoGiaoVien canBoGiaoVien = (CanBoGiaoVien)nguoi;
                    canBoGiaoVien.hienThiThongTin();
                    System.out.println("---------------------");
                }
            }
        }
    }

    public void hienThiTatCa(double luongThucLinh){
        if(quanLyCanBo.isEmpty()){
            System.out.println("Không có cán bộ nào trong danh sách.");
        }else {
            System.out.println("Tất cả cán bộ có lương trên 8.000.000đ là: ");
            for(Nguoi nguoi : quanLyCanBo){
                if(nguoi instanceof CanBoGiaoVien){
                    CanBoGiaoVien canBoGiaoVien = (CanBoGiaoVien)nguoi;
                    if(canBoGiaoVien.luongThucLinh() >= luongThucLinh){
                        canBoGiaoVien.hienThiThongTin();
                        System.out.println("-----------------------");
                    }
                }
            }
        }
    }
}
