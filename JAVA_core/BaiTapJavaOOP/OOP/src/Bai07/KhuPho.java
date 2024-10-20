package Bai07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KhuPho {
    private List<HoDan> quanLyKhuPho;

    public KhuPho() {
        this.quanLyKhuPho = new ArrayList<HoDan>();
    }

    public void nhapThongTinHoDan(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hộ dân: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i<n; i ++){
            System.out.print("Nhập số nhà của hộ dân thứ " +(i + 1) + ": ");
            String soNha = scanner.nextLine();
            HoDan hoDan = new HoDan(soNha);

            System.out.print("Nhập số thành viên trong hộ: ");
            int soThanhVien = scanner.nextInt();
            scanner.nextLine();

            for(int j = 0; j<soThanhVien; j ++){
                System.out.print("Nhập họ tên thành viên thứ: " +(j + 1)+ ": ");
                String hoTen = scanner.nextLine();
                System.out.print("Nhập ngày sinh (dd//MM/yyyy): ");
                String ngaySinh = scanner.nextLine();
                System.out.print("Nhập nghề nghiệp: ");
                String ngheNghiep = scanner.nextLine();

                Nguoi nguoi = new Nguoi(hoTen, ngaySinh, ngheNghiep);
                hoDan.themThanhVien(nguoi);
            }
            quanLyKhuPho.add(hoDan);
        }
    }

    public void hienThiToanBoHoDan(){
        for(HoDan hoDan : quanLyKhuPho){
           hoDan.hienThiThongTin();
        }
    }

    public void hienThiHoDanCoNguoiThuongTho(){
        System.out.println("Các hộ dân có người mừng thượng thọ là: ");
        for(HoDan hoDan : quanLyKhuPho){
            if(hoDan.coThanhVienHuongTho()){
                hoDan.hienThiThongTin();
            }
        }
    }
}
