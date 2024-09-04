package BaiTapOOP_11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        int luaChon = 0;
        do{
            System.out.println("------------------------");
            System.out.println("1. Nhập vào cán bộ ");
            System.out.println("2. In ra cán bộ ");
            System.out.println("3. Tính lương của cán bộ ");
            System.out.println("4. In ra cán bộ có lương trên 8tr");
            System.out.print("** Xin mời chọn chức năng: ");
            luaChon = sc.nextInt();
            sc.nextLine();

            if(luaChon == 1){
                System.out.println("Nhập tên: ");
                String hoTen = sc.nextLine();

                System.out.println("Nhập quê quán: ");
                String queQuan = sc.nextLine();

                System.out.println("Nhập ngày tháng năm sinh: ");
                LocalDate ngaySinh= LocalDate.parse(sc.nextLine(), formatter);

                System.out.println("Nhập lương cứng: ");
                double luongCung = sc.nextDouble();

                System.out.println("Nhập tiền thưởng: ");
                double thuong = sc.nextDouble();

                System.out.println("Nhập số tiền bị phạt: ");
                Double phat = sc.nextDouble();

                System.out.println("Nhập lương thực lĩnh: ");
                Double luongThucLinh = sc.nextDouble();
                sc.nextLine();

                CanBo canbo = new CanBo(hoTen,ngaySinh,queQuan,luongCung,thuong,phat,luongThucLinh);
                quanLyCanBo.themCanBo(canbo);
            }else if(luaChon == 2){
                quanLyCanBo.inCanBo();
            }else if(luaChon == 3){
                System.out.print("Nhập vào tên cán bộ cần được tìm: ");
                String hoTen = sc.nextLine();
                quanLyCanBo.tinhLuongCuaCanBo(hoTen);
            } else if (luaChon == 4) {
                quanLyCanBo.inRaLuongTren8Tr();
            }
        }while (luaChon != 0);
    }
}
