package Quan_ly_sinh_vien_OOP;

public class Main {
    public static void main(String[]args) {
        Lop lop1 = new Lop("K66CNTTA", "Cong Nghe Thong Tin");
        Lop lop2 = new Lop("K67CNOTOA", "Co Dien");
        Lop lop3 = new Lop("K66TYA", "Thu Y");
        Lop lop4 = new Lop("K67CNTTC", "Cong Nghe Thong Tin");

        NgaySinh ngaySinh1 = new NgaySinh(25,9,2003);
        NgaySinh ngaySinh2 = new NgaySinh(21,7,2004);
        NgaySinh ngaySinh3 = new NgaySinh(11,8,2003);
        NgaySinh ngaySinh4 = new NgaySinh(25,9,2003);

        SinhVien sinhVien1 = new SinhVien(66661452,"Nguyen Van A", ngaySinh1, 8.5,lop1);
        SinhVien sinhVien2 = new SinhVien(67666452,"Hoang Van B", ngaySinh2, 7.5,lop2);
        SinhVien sinhVien3 = new SinhVien(66671452,"Dang Thi C", ngaySinh3, 2.5,lop3);
        SinhVien sinhVien4 = new SinhVien(67662552,"Tran Van Duc D", ngaySinh4, 3.5,lop4);

        System.out.println("Hien Thi Ten Khoa Cua Sinh Vien: "+ sinhVien1.hienThiTenKhoa());
        System.out.println("Hien Thi Ten Khoa Cua Sinh Vien: "+ sinhVien2.hienThiTenKhoa());
        System.out.println("Hien Thi Ten Khoa Cua Sinh Vien: "+ sinhVien3.hienThiTenKhoa());
        System.out.println("Hien Thi Ten Khoa Cua Sinh Vien: "+ sinhVien4.hienThiTenKhoa());

        System.out.println("Kiem tra sinh vien do hay truot: "+ sinhVien1.kiemTraDauOfKhong());
        System.out.println("Kiem tra sinh vien do hay truot: "+ sinhVien2.kiemTraDauOfKhong());
        System.out.println("Kiem tra sinh vien do hay truot: "+ sinhVien3.kiemTraDauOfKhong());
        System.out.println("Kiem tra sinh vien do hay truot: "+ sinhVien4.kiemTraDauOfKhong());

        System.out.println("Kiem tra sinhvien1 trung ngay sinh cua sinhvien2: "+ sinhVien1.kiemTraNgaySinh(sinhVien2));
        System.out.println("Kiem tra sinhvien1 trung ngay sinh cua sinhvien3: "+ sinhVien1.kiemTraNgaySinh(sinhVien3));
        System.out.println("Kiem tra sinhvien1 trung ngay sinh cua sinhvien4: "+ sinhVien1.kiemTraNgaySinh(sinhVien4));
    }
}
