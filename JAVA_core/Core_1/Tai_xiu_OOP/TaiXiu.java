package Tai_xiu_OOP;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
1 nguoi choi se co tai khoan, nguoi choi co quyen dat cuoc so tien it hon hoac = so tien ho dang co hien tai
luat choi:
- 3 vien xuc sac. Moi vien xuc xac co 6 mat co gia tri tu 1 den 6
- Moi lan lac xuc sac se ra 1 ket qua. ket qua se bang xx1 + xx2 + xx3
- 1. Neu tong = 3 hoac 18 ==> nha cai an het nguoi choi thua
- 2. Neu tong = (4-->10) <-->xiu ==> nguoi choi dat xiu = thang, nguoc lai la thua
- 3. Neu tong = (11-->17) <-->tai ==> nguoi choi dat tai = thang, nguoc lai la thua
 */
public class TaiXiu {
    public static void main(String[] args) {
        double taiKhoanNguoiChoi = 5000000.99;
        Scanner sc = new Scanner(System.in);

        //Locale lc = new Locale("vi", "VN");
        Locale lc = new Locale("en", "US");

        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);

        int luaChon = 1;
        do {
            System.out.println("--------MOI BAN LUA CHON-----------");
            System.out.println("Chon phim (1) de tiep tuc choi");
            System.out.println("Chon phim (bat ki) de thoat");
            luaChon = sc.nextInt();
            if (luaChon == 1) {
                System.out.println("***BAT DAU CHOI: ");
                System.out.println("*******Tai khoan cua ban hien tai: " + numf.format(taiKhoanNguoiChoi) + " Ban muon cuoc bao nhieu ?");

                //Dat cuoc
                double datCuoc = 0;
                do {
                    System.out.println("******Dat cuoc nho hon so tien cuoc la " + numf.format(taiKhoanNguoiChoi) + ":");
                    datCuoc = sc.nextDouble();
                } while (datCuoc > taiKhoanNguoiChoi || datCuoc <= 0);

                //Chon tai xiu
                int luaChonTaiXiu = 0;
                do {
                    System.out.println("***** Chon: 1 <-> Tai hoac 2 <-> Xiu");
                    luaChonTaiXiu = sc.nextInt();
                } while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);

                //Tung xuc sac
                Random xucXac1 = new Random();
                Random xucXac2 = new Random();
                Random xucXac3 = new Random();

                int giaTri1 = xucXac1.nextInt(5) + 1;
                int giaTri2 = xucXac2.nextInt(5) + 1;
                int giaTri3 = xucXac3.nextInt(5) + 1;

                int Tong = giaTri1 + giaTri2 + giaTri3;

                //Tinh toan ket qua
                System.out.println("*****KET QUA LA: " + giaTri1 + " - " + giaTri2 + " - " + giaTri3);
                if (Tong == 3 || Tong == 18) {
                    taiKhoanNguoiChoi -= datCuoc;
                    System.out.println("***TONG LA: " + Tong + "==> nha cai AN !!!!");
                    System.out.println("***TAI KHOAN CUA BAN LA: " + numf.format(taiKhoanNguoiChoi));
                } else if (Tong >= 4 && Tong <= 10) {
                    System.out.println("***TONG LA: " + Tong + "==> Xiu !!!!");
                    if (luaChonTaiXiu == 2) {
                        System.out.println("***BAN DA THANG CUOC: " + numf.format(taiKhoanNguoiChoi));
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("***TAI KHOAN CUA BAN LA: " + numf.format(taiKhoanNguoiChoi));
                    } else {
                        System.out.println("***BAN DA THUA CUOC: " + numf.format(taiKhoanNguoiChoi));
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("***TAI KHOAN CUA BAN LA: " + numf.format(taiKhoanNguoiChoi));
                    }
                } else {
                    if (Tong >= 11 && Tong <= 17) {
                        System.out.println("***TONG LA: " + Tong + "==> Tai !!!!");
                        if (luaChonTaiXiu == 1) {
                            System.out.println("***BAN DA THANG CUOC: " + numf.format(taiKhoanNguoiChoi));
                            taiKhoanNguoiChoi += datCuoc;
                            System.out.println("***TAI KHOAN CUA BAN LA: " + numf.format(taiKhoanNguoiChoi));
                        } else {
                            System.out.println("***BAN DA THUA CUOC: " + numf.format(taiKhoanNguoiChoi));
                            taiKhoanNguoiChoi -= datCuoc;
                            System.out.println("***TAI KHOAN CUA BAN LA: " + numf.format(taiKhoanNguoiChoi));
                        }
                    }
                }
            }
        }while (luaChon == 1) ;
    }
}
