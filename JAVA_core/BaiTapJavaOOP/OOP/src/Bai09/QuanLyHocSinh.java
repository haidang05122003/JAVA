package Bai09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyHocSinh {
    private List<Nguoi> quanLyHocSinh;

    public QuanLyHocSinh() {
        this.quanLyHocSinh = new ArrayList<Nguoi>();
    }

    public void nhapThongTinHocSinh(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng học sinh: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin của học sinh thứ "+(i+1)+": ");
            System.out.print("Họ Tên: ");
            String hoTen = scanner.nextLine();

            System.out.print("Ngày sinh (dd/MM/yyyy): ");
            String ngaySinh = scanner.nextLine();

            System.out.print("Quê quán: ");
            String queQuan = scanner.nextLine();

            System.out.print("Lớp: ");
            String lop = scanner.nextLine();

            System.out.print("Khóa học: ");
            String loaiPhongTro = scanner.nextLine();

            System.out.print("Kì học: ");
            String kiHoc = scanner.nextLine();

            HoSoHocSinh hoSoHocSinh = new HoSoHocSinh(hoTen, ngaySinh, queQuan, lop, loaiPhongTro, kiHoc);
            this.quanLyHocSinh.add(hoSoHocSinh);
        }
    }

    public void hienThiHoSoHocSinh(){
        for(Nguoi nguoi : this.quanLyHocSinh){
            if(nguoi instanceof HoSoHocSinh){
                HoSoHocSinh hoSoHocSinh = (HoSoHocSinh) nguoi;
                System.out.println(hoSoHocSinh);
            }
        }
    }

    public void hienThiHoSoHocSinh(String queQuan){
        for(Nguoi nguoi : this.quanLyHocSinh){
            if(nguoi instanceof HoSoHocSinh){
                HoSoHocSinh hoSoHocSinh = (HoSoHocSinh) nguoi;
                if(hoSoHocSinh.getQueQuan().equalsIgnoreCase(queQuan) && hoSoHocSinh.getNgaySinh().getYear() == 1985){
                    System.out.println(hoSoHocSinh);
                }
            }
        }
    }

    public void hienThiHoSoHocSinhTheoLop(String lop){
        for(Nguoi nguoi : this.quanLyHocSinh){
            if(nguoi instanceof HoSoHocSinh){
                HoSoHocSinh hoSoHocSinh = (HoSoHocSinh) nguoi;
                if(hoSoHocSinh.getLop().equalsIgnoreCase(lop)){
                    System.out.println(hoSoHocSinh);
                }
            }
        }
    }

}
