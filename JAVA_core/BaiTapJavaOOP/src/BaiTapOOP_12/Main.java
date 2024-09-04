package BaiTapOOP_12;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        QuanLyTheMuon quanLyTheMuon = new QuanLyTheMuon();

        int luaChon = 0;
        do{
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            System.out.println("*********** MENU **************");
            System.out.println("1. Nhập vào thông tin thẻ mượn của sinh viên ");
            System.out.println("2. In ra màn hình thông tin tất cả thẻ mượn ");
            System.out.println("3. In ra danh sách sinh viên, tên sách mượn cần trả vào cuối tháng ");
            System.out.println("0. Thoát khỏi chương trình ");
            luaChon = sc.nextInt();
            sc.nextLine();

            if(luaChon == 1){
                System.out.println("1. Nhập tên sinh viên: ");
                String hoTen = sc.nextLine();

                System.out.println("2. Nhập mã sinh viên: ");
                String maSV = sc.nextLine();

                System.out.println("3. Nhập ngày tháng năm sinh của sinh viên: ");
                LocalDate ngaySinh = LocalDate.parse(sc.nextLine(), formatter);

                System.out.println("4. Nhập lớp học của sinh viên: ");
                String lop = sc.nextLine();

                System.out.println("5. Nhập vào số phiếu mượn: ");
                int soPhieuMuon = sc.nextInt();
                sc.nextLine();

                System.out.println("6. Nhập vào ngày mượn: ");
                LocalDate ngayMuon = LocalDate.parse(sc.nextLine(), formatter);

                System.out.println("7. Nhập vào hạn trả: ");
                LocalDate hanTra = LocalDate.parse(sc.nextLine(), formatter);

                System.out.println("8. Nhập vào số hiệu sách: ");
                String soHieuSach = sc.nextLine();


                TheMuon theMuon = new TheMuon(hoTen,maSV,ngaySinh,lop,soPhieuMuon,ngayMuon,hanTra,soHieuSach);
                quanLyTheMuon.themSinhVien(theMuon);
            }else if(luaChon == 2){
                quanLyTheMuon.inSinhVien();
            }else if(luaChon == 3){
                quanLyTheMuon.inThongTinTraSach();
            }
        }while (luaChon != 0);
    }
}
