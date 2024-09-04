package BaiTapOOP_16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyPhuongTien quanLyPhuongTien = new QuanLyPhuongTien();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        int luaChon = 0;

        do{
            System.out.println("*********MENU********");
            System.out.println("1. Thêm phương tiện ");
            System.out.println("2. In phương tiện ra màn hình ");
            System.out.println("3. Tìm phương tiện theo màu ");
            System.out.println("4. Tìm phương tiện theo năm ");
            System.out.println("0. Thoát chương trình ");
            System.out.print("************XIN MOI CHON:  ");
            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon == 1){
                int loaiXe = 0;
                do {
                    System.out.println("Loại xe muốn thêm");
                    System.out.println("1. Xe Ô tô");
                    System.out.println("2. Xe máy ");
                    System.out.println("3. Xe Tải ");
                    loaiXe = sc.nextInt();
                    sc.nextLine();

                    if (loaiXe == 1) {
                        System.out.print("Hãng sản xuất: ");
                        String hangSX = sc.nextLine();

                        System.out.println("Ngày sản xuất: ");
                        LocalDate namSX = LocalDate.parse(sc.nextLine(), formatter);

                        System.out.print("Giá bán: ");
                        int giaBan = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Màu săc: ");
                        String mau = sc.nextLine();

                        System.out.print("Số chỗ: ");
                        String soCho = sc.nextLine();

                        System.out.print("Kiểu động cơ: ");
                        String kieuDongCo = sc.nextLine();

                        Oto oto = new Oto(hangSX, mau,namSX,giaBan,soCho,kieuDongCo);
                        quanLyPhuongTien.themPhuongTien(oto);

                    }else if(loaiXe == 2){

                        System.out.print("Hãng sản xuất: ");
                        String hangSX = sc.nextLine();

                        System.out.println("Ngày sản xuất: ");
                        LocalDate namSX = LocalDate.parse(sc.nextLine(), formatter);

                        System.out.print("Giá bán: ");
                        int giaBan = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Màu săc: ");
                        String mau = sc.nextLine();

                        System.out.print("Công suất: ");
                        String congSuat = sc.nextLine();

                        XeMay xeMay = new XeMay(hangSX, mau,namSX,giaBan,congSuat);
                        quanLyPhuongTien.themPhuongTien(xeMay);


                    }else if(loaiXe == 3){
                        System.out.print("Hãng sản xuất: ");
                        String hangSX = sc.nextLine();

                        System.out.println("Ngày sản xuất: ");
                        LocalDate namSX = LocalDate.parse(sc.nextLine(), formatter);

                        System.out.print("Giá bán: ");
                        int giaBan = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Màu săc: ");
                        String mau = sc.nextLine();

                        System.out.print("Trọng tải: ");
                        String trongTai = sc.nextLine();

                        XeTai xeTai = new XeTai(hangSX, mau,namSX,giaBan,trongTai);
                        quanLyPhuongTien.themPhuongTien(xeTai);
                    }
                }while(loaiXe != 0);
            } else if (luaChon == 2) {
                quanLyPhuongTien.inPhuongTien();
            } else if (luaChon == 3) {
                System.out.println("Nhập vào màu: ");
                String mau = sc.nextLine();
                quanLyPhuongTien.timLoaiPhuongTienTheoMau(mau);
            } else if (luaChon == 4) {
                System.out.println("Nhập vào năm sản xuất: ");
                LocalDate namSX = LocalDate.parse(sc.nextLine(), formatter);
                quanLyPhuongTien.timLoaiPhuongTienTheoNam(namSX);
            }
        }while (luaChon != 0);
    }
}
