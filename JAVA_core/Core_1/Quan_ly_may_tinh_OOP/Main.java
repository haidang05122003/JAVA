package Quan_ly_may_tinh_OOP;

public class Main {
    public static void main(String[]args) {
        QuocGia quocGia1 = new QuocGia(1, "My");
        QuocGia quocGia2 = new QuocGia(12, "Nhat");
        QuocGia quocGia3 = new QuocGia(22, "Trung Quoc");
        QuocGia quocGia4 = new QuocGia(45, "Dai Loan");

        HangSanXuat hangSanXuat1 = new HangSanXuat("Lenovo Slim", quocGia3);
        HangSanXuat hangSanXuat2 = new HangSanXuat("Razer Blaze 15", quocGia1);
        HangSanXuat hangSanXuat3 = new HangSanXuat("Lenovo Legion 5", quocGia4);
        HangSanXuat hangSanXuat4 = new HangSanXuat("HP Omen", quocGia2);

        NgaySanXuat ngaySanXuat1 = new NgaySanXuat(15,2,2024);
        NgaySanXuat ngaySanXuat2 = new NgaySanXuat(21,3,2024);
        NgaySanXuat ngaySanXuat3 = new NgaySanXuat(4,8,2024);
        NgaySanXuat ngaySanXuat4 = new NgaySanXuat(11,12,2023);

        MayTinh mayTinh1 = new MayTinh(hangSanXuat1, ngaySanXuat1,25000000, "2 nam");
        MayTinh mayTinh2 = new MayTinh(hangSanXuat2, ngaySanXuat1,45000000, "2 nam");
        MayTinh mayTinh3 = new MayTinh(hangSanXuat3, ngaySanXuat1,35000000, "1.5 nam");
        MayTinh mayTinh4 = new MayTinh(hangSanXuat4, ngaySanXuat1,37000000, "1 nam");

        System.out.println("Gia ban cua may1 co thap hon may2 ko: " +mayTinh1.kiemTraGiaBan(mayTinh2));
        System.out.println("Gia ban cua may2 co thap hon may3 ko: " +mayTinh2.kiemTraGiaBan(mayTinh3));
        System.out.println("Gia ban cua may3 co thap hon may4 ko: " +mayTinh3.kiemTraGiaBan(mayTinh4));

        System.out.println("Ten quoc gia san xuat may tinh: "+mayTinh1.inRaTenQG());
        System.out.println("Ten quoc gia san xuat may tinh: "+mayTinh2.inRaTenQG());
        System.out.println("Ten quoc gia san xuat may tinh: "+mayTinh3.inRaTenQG());
        System.out.println("Ten quoc gia san xuat may tinh: "+mayTinh4.inRaTenQG());
    }
}
