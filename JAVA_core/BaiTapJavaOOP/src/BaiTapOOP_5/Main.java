package BaiTapOOP_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        int luaChon = 0;

        do {
            System.out.println("************MENU***********");
            System.out.println("1. Nhap thong tin can bo");
            System.out.println("2. Hien thi thong tin can bo da nhap");
            System.out.println("3. Tim kiem va hien thi can bo theo ten");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon cua ban: ");
            luaChon = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng newline sau khi nhập số

            if (luaChon == 1) {
                String hoTen, gioiTinh, diaChi, bac, nganh, congViec;
                int ngaySinh, loaiCanBo;
                do {
                    System.out.print("Nhap vao ho ten can bo: ");
                    hoTen = sc.nextLine();
                    System.out.print("Nhap gioi tinh: ");
                    gioiTinh = sc.nextLine();
                    System.out.print("Nhap vao ngay sinh can bo: ");
                    ngaySinh = sc.nextInt();
                    sc.nextLine(); // Đọc bỏ dòng newline sau khi nhập số
                    System.out.print("Nhap dia chi: ");
                    diaChi = sc.nextLine();

                    System.out.println("Chon loai can bo:");
                    System.out.println("4. Cong nhan");
                    System.out.println("5. Ky Su");
                    System.out.println("6. Nhan Vien phuc vu");
                    System.out.print("Lua chon: ");
                    loaiCanBo = sc.nextInt();
                    sc.nextLine(); // Đọc bỏ dòng newline

                    if (loaiCanBo == 4) {
                        System.out.print("Nhap vao bac cua cong nhan: ");
                        bac = sc.nextLine();
                        CongNhan congNhan = new CongNhan(hoTen, ngaySinh, gioiTinh, diaChi, bac);
                        quanLyCanBo.themCanBo(congNhan);
                    } else if (loaiCanBo == 5) {
                        System.out.print("Nhap vao nganh dao tao cua ky su: ");
                        nganh = sc.nextLine();
                        KySu kySu = new KySu(hoTen, ngaySinh, gioiTinh, diaChi, nganh);
                        quanLyCanBo.themCanBo(kySu);
                    } else if (loaiCanBo == 6) {
                        System.out.print("Nhap cong viec cua nhan vien: ");
                        congViec = sc.nextLine();
                        NhanVien nhanVien = new NhanVien(hoTen, ngaySinh, gioiTinh, diaChi, congViec);
                        quanLyCanBo.themCanBo(nhanVien);
                    } else {
                        System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    }
                } while (loaiCanBo < 4 || loaiCanBo > 6);

            } else if (luaChon == 2) {
                quanLyCanBo.inCanBo();
            } else if (luaChon == 3) {
                System.out.print("Nhap ten can bo can tim: ");
                String tenCanTim = sc.nextLine();
                quanLyCanBo.timTheoTenCanBo(tenCanTim);
            } else if (luaChon != 0) {
                System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (luaChon != 0);

        sc.close(); // Đóng Scanner sau khi kết thúc chương trình
    }
}
