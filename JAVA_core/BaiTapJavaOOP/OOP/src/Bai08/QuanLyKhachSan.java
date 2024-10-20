package Bai08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyKhachSan {
    private List<Nguoi> quanLyKhachTro;

    public QuanLyKhachSan() {
        this.quanLyKhachTro = new ArrayList<Nguoi>();
    }

    public void nhapThongTinKhachTro(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số khách có trong khách sạn: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin của khách trọ thứ "+(i+1)+": ");
            System.out.print("Họ Tên: ");
            String hoTen = scanner.nextLine();

            System.out.print("Ngày sinh (dd/MM/yyyy): ");
            String ngaySinh = scanner.nextLine();

            System.out.print("Số Chứng minh thư: ");
            int soChungMinhThu = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Số ngày trọ: ");
            int soNgayTro = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Loại phòng trọ: ");
            String loaiPhongTro = scanner.nextLine();

            System.out.print("Giá phòng trọ: ");
            int giaPhongTro = scanner.nextInt();
            scanner.nextLine();

            KhachSan khachSan = new KhachSan(hoTen, ngaySinh,soChungMinhThu,soNgayTro,loaiPhongTro,giaPhongTro);
            this.quanLyKhachTro.add(khachSan);
        }
    }

    public void HienThiToanBo(){
        for(Nguoi nguoi : quanLyKhachTro){
            System.out.println(nguoi.toString());
        }
    }

    public double tinhTienTro(int soChungMinhThu){
        for(Nguoi nguoi : quanLyKhachTro){
            if(nguoi instanceof KhachSan){
                KhachSan khachSan = (KhachSan)nguoi;
               if(khachSan.getSoChungMinhThu() == soChungMinhThu){
                   return khachSan.tinhTienTro();
               }
            }
        }
        return 0;
    }

}
