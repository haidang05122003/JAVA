package Bai06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TuyenSinh tuyenSinh = new TuyenSinh();
        Scanner scanner = new Scanner(System.in);

        //Nhap vao tu ban phim
        tuyenSinh.nhapThongTinThiSinh();

        //Hien thi thong tin thi sinh da nhap vao
        tuyenSinh.hienThiThiSinh();

        //Tim kiem thi sinh theo so bao danh
        System.out.print("Nhập vào số báo danh thí sinh cần tìm: ");
        String soBaoDanh = scanner.nextLine();
        ThiSinh thiSinh = tuyenSinh.timKiemThiSinh(soBaoDanh);

        //hien thi thi sinh vua tim kiem duoc
        tuyenSinh.hienThiThongTinTimKiem(thiSinh);

        scanner.close();
    }
}
