package BaiTapOOP_17;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TamGiac> danhSachTamGiac = new ArrayList<>();

        System.out.print("Nhap so luong tam giac: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print("Nhap so canh tam giac: "+ (i+1)+ ":");
            ArrayList<Integer> kichThuocCacCanh = new ArrayList<>();
            for(int j = 0; j < 3; j++) {
                System.out.print("Canh: "+(j+1)+":");
                kichThuocCacCanh.add(sc.nextInt());
            }
            TamGiac tamGiac = new TamGiac(kichThuocCacCanh);
            if(tamGiac.kiemTraHopLe()){
                danhSachTamGiac.add(tamGiac);
            }else{
                System.out.println("Tam giac khong hop le");
            }
        }

        System.out.println("Danh sach tam giac: ");
        for(TamGiac tamGiac : danhSachTamGiac) {
            System.out.println(tamGiac.toString());
        }

        TamGiac tamGiacMaxDienTich = null;
        double maxDienTich = 0;

        for(TamGiac tamGiac : danhSachTamGiac) {
            double dienTich = tamGiac.tinhDienTich();
            if(dienTich > maxDienTich) {
                maxDienTich = dienTich;
                tamGiacMaxDienTich = tamGiac;
            }
        }

        if(tamGiacMaxDienTich != null) {
            System.out.println("Tam giac co dien tich lon nhat la: ");
            System.out.println(tamGiacMaxDienTich);
        }else {
            System.out.println("ko tam giac nao hop le");
        }
        sc.close();
    }
}
