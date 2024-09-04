package BaiTapOOP_10;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhuPho quanLyKhuPho = new KhuPho();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        int luaChon = 0;

        do{
            System.out.println("-------------MENU------------");
            System.out.println("1. Nhập thông tin của hộ dân: ");
            System.out.println("2. Hiện thi thông tin hộ dân ");
            System.out.println("3. Hiển thị Thông tin của hô dân có người 80 tuôi");
            System.out.print("************Chọn chức năng: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon == 1){
                System.out.println("Hộ có gồm bao nhiêu thành viên: ");
                int soThanhVien = sc.nextInt();

                System.out.print("Nhập vào số nhà: ");
                int soNha = sc.nextInt();
                sc.nextLine();

                HoDan hoDan = new HoDan(soNha);

               for(int i = 0; i < soThanhVien; i++){
                    System.out.println("Nhập số thành viên thứ: "+(i+1) + ":");

                    System.out.print("Nhập tên: ");
                    String hoTen = sc.nextLine();

                    System.out.print("Nhập ngày sinh: ");
                    LocalDate ngaySinh;
                    while (true){
                       try {
                           ngaySinh = LocalDate.parse(sc.nextLine(), formatter);
                           break;
                       }catch (Exception e){
                           System.out.println("Ngày sinh không hợp lệ !!!");
                         }
                    }

                    System.out.print("Nhập nghề nghiệp: ");
                    String ngheNghiep = sc.nextLine();

                   Nguoi nguoi = new Nguoi(hoTen, ngaySinh, ngheNghiep);
                   hoDan.themNguoi(nguoi);
                }
               quanLyKhuPho.themHoDan(hoDan);
            }else if(luaChon == 2){
                quanLyKhuPho.inRaHoDan();
            }else if(luaChon == 3){
                quanLyKhuPho.inThongTinMungTho();
            }
        }while (luaChon != 0);
    }
}
