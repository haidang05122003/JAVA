package GhiDoiTuongXuongFile_File;


import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv =  new DanhSachSinhVien();
        int luaChon = 0;
        do{
            System.out.println("_____________MENU______________");
            System.out.println("Vui long chon chuc nang: ");
            System.out.println(
                      "1. Them sinh vien vao danh sach.\n"
                    + "2. In danh sach sinh vien ra man hinh.\n"
                    + "3. Kiem tra danh sach co rong hay khong.\n"
                    + "4. Lay ra so luong sinh vien trong danh sach.\n"
                    + "5. Lam rong danh sach sinh vien.\n"
                    + "6. Kiem tra sinh vien co ton tai trong danh sach hay khong, dua tren ma sinh vien.\n"
                    + "7. Xoa 1 sinh vien ra khoi danh sach dua tren ma sinh vien.\n"
                    + "8. Tim kiem tat ca sinh vien dua tren Ten duoc nhap tu ban phim.\n"
                    + "9. Xuat ra man hinh danh sach sinh vien co diem tu cao den thap.\n"
                    + "10. Luu danh sach sinh vien xuong tap tin.\n"
                    + "11. Doc danh sach sinh vien tu tap tin.\n"
                    + "0. Thoat "
                    + ""
            );
            luaChon = sc.nextInt();
            sc.nextLine();

            if(luaChon == 1){
                //Them sinh vien vao danh sach
                System.out.println("Nhap ma sinh vien: "); String maSinhVien = sc.nextLine();
                System.out.println("Nhap ho va ten: "); String hoVaTen = sc.nextLine();
                System.out.println("Nhap nam sinh: "); int namSinh = sc.nextInt();
                System.out.println("Nhap diem trung binh: "); Double diemTrungBinh = sc.nextDouble();
                SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                dssv.themSinhVien(sv);

            }else if(luaChon == 2){
                // In danh sach sinh vien ra man hinh
                dssv.inDanhSachSinhVien();
            } else if (luaChon == 3) {
                //Kiem tra danh sach co rong hay khong.
                System.out.println("Kiem tra danh sach rong: "+dssv.kiemTraDanhSachRong());
            } else if (luaChon == 4) {
                // Lay ra so luong sinh vien trong danh sach.
                System.out.println("So luong sinh vien hien tai : "+dssv.laySoluongSinhVien());
            } else if (luaChon == 5) {
                //Lam rong danh sach sinh vien
                dssv.lamRongDanhSachSinhVien();
            } else if (luaChon == 6) {
                //Kiem tra sinh vien co ton tai trong danh sach hay khong, dua tren ma sinh vien.
                System.out.println("Nhap ma sinh vien: "); String maSinhVien = sc.nextLine();
                SinhVien sv =new SinhVien(maSinhVien);
                System.out.println("Sinh vien co trong sanh sach: " +dssv.kiemTraTonTai(sv));
            } else if (luaChon == 7) {
                //Xoa 1 sinh vien ra khoi danh sach dua tren ma sinh vien.
                System.out.println("Nhap ma sinh vien: "); String maSinhVien = sc.nextLine();
                SinhVien sv =new SinhVien(maSinhVien);
                System.out.println("Xoa Sinh vien trong sanh sach " +dssv.xoaMotSinhVien(sv));
            } else if (luaChon == 8) {
                //Tim kiem tat ca sinh vien dua tren Ten duoc nhap tu ban phim.
                System.out.println("Nhap ho va ten: "); String hoVaTen = sc.nextLine();
                System.out.println("Ket qua tim kiem: ");
                dssv.timSinhVien(hoVaTen);
            } else if (luaChon == 9) {
                //Xuat ra man hinh danh sach sinh vien co diem tu cao den thap.
                dssv.sapXepSinhVienGiamTheoDiem();
                dssv.inDanhSachSinhVien();
            } else if (luaChon == 10) {
                System.out.println("Nhap ten file: ");
                String tenFile = sc.nextLine();
                File file = new File(tenFile);
                dssv.ghiDuLieuXuongFile(file);
            }else if (luaChon == 11) {
                System.out.println("Nhap ten file: ");
                String tenFile = sc.nextLine();
                File file = new File(tenFile);
                dssv.docDuLieuTuFile(file);
            }
        }while(luaChon != 0);
    }
}
