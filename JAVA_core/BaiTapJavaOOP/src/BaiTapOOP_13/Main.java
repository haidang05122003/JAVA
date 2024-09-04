package BaiTapOOP_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyBienLai quanLyBienLai = new QuanLyBienLai();

        int luaChon = 0;
        do{
            System.out.println("-------------MENU");
            System.out.println("1. Thêm biên lai ");
            System.out.println("2. In ra tất cả biên lai ");
            System.out.println("3. Tính số tiền điện phải trả");
            System.out.print("----------Mời bạn nhập: ");
            luaChon = sc.nextInt();
            sc.nextLine();

            if(luaChon == 1){
                System.out.println("1. Họ Tên: ");
                String hoTen = sc.nextLine();

                System.out.println("2. Số Nhà:  ");
                int soNha = sc.nextInt();
                sc.nextLine();

                System.out.println("3. Số Công Tơ:  ");
                int soCongTo = sc.nextInt();
                sc.nextLine();

                System.out.println("4. Số cũ:  ");
                int soCu = sc.nextInt();
                sc.nextLine();

                System.out.println("5. Số mới: ");
                int soMoi = sc.nextInt();
                sc.nextLine();

                System.out.println("6. Số tiền phải trả: ");
                double soTienTra = sc.nextDouble();
                sc.nextLine();

                BienLai bienLai = new BienLai(hoTen, soNha, soCongTo, soCu, soMoi, soTienTra);
                quanLyBienLai.themBienLai(bienLai);
            }else if(luaChon == 2){
                quanLyBienLai.inBienLai();
            } else if (luaChon == 3) {
                System.out.print("Nhập vào tên của hộ: ");
                String hoTen = sc.nextLine();
                quanLyBienLai.tinhTienPhaiTra(hoTen);
            }
        }while (luaChon != 0);
    }
}
