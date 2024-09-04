package BaiTapOOP_1;
/*
Bài 15(lthdtbai15.cpp): Tính diện tích và chu vi hình tam giác có 3 cạnh a,b,c. Ba cạnh a,b,c có thể nhập vào
từ bàn phím hoặc từ tệp văn bản.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChuVi cv = new ChuVi();
        DienTich dt = new DienTich();

        int luaChon = 0;
        do{
            System.out.println("_____________MENU______________");
            System.out.println("1. Kiem tra xem ba canh co tao thanh 1 tam giac khong: ");
            System.out.println("2. Tinh chu vi tam giac: ");
            System.out.println("3. Tinh dien tich tam giac: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon == 1){
                System.out.println("Vui long nhap vao 3 canh cua tam giac: ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                TamGiac tamGiac = new TamGiac(a, b, c);
                tamGiac.dieuKien();
            }
            else if(luaChon == 2){
                System.out.println("Vui long nhap vao 3 canh cua tam giac: ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                TamGiac tamGiac = new TamGiac(a, b, c);
                System.out.println("Chu vi tam giac la: "+cv.chuViTamGiac(tamGiac));
            }
            else if(luaChon == 3){
                System.out.println("Vui long nhap vao 3 canh cua tam giac: ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                TamGiac tamGiac = new TamGiac(a, b, c);
                System.out.println("Dien tich tam giac la: "+ dt.dienTichTamGiac(tamGiac));
            }
        }while (luaChon !=1);
    }
}
