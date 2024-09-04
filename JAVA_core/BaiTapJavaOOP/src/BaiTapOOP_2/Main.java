package BaiTapOOP_2;
/*
Bài 16(lthdtbai16.cpp): Đọc vào bán kính và màu nền (Xanh, Đỏ, Tím, Vàng) của n hình tròn
từ tệp văn bản "hinhtron.txt". Đưa ra màn hình bán kính, màu nền, diện tích và chu vi
của các hình tròn. Tính tổng diện tích và chu vi của n hình tròn.
--- hoc xong quay lai lam- --Đếm số lượng hình tròn có nền màu Xanh, Đỏ, Tím, Vàng.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DienTich_ChuVi dt_cv = new DienTich_ChuVi();
        int luaChon = 0;
        do{
            System.out.println("_____________MENU______________");
            System.out.println("Vui long chon chuc nang: ");
            System.out.println(
                            "1. Nhap vao mau cua hinh tron va ban kinh .\n"
                            + "2. In danh sach mua hinh tron va ban kinh kem theo.\n"
                            + "3. Tinh chu vi va dien tich.\n"
                            + "4. Dem so mau co trong mang.\n"
            );
            luaChon = sc.nextInt();
            sc.nextLine();

            if(luaChon == 1){
                //them hinh tron vao mang
                System.out.println("Nhap mau cua hinh tron: "); String mau = sc.nextLine();
                System.out.println("Nhap vao ban kinh cua hinh tron "); double r = sc.nextDouble();
                HinhTron ht = new HinhTron(r,mau);
                dt_cv.themHinhTron(ht);

            }else if(luaChon == 2){
                dt_cv.inRaManHinh();
            }else if(luaChon == 3){
              dt_cv.tinhVaInChuViVaDienTich();
            }else if(luaChon == 4){

            }
        }while(luaChon != 0);
    }
}
