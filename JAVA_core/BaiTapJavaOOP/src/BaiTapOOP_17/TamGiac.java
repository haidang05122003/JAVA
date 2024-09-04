package BaiTapOOP_17;

import java.util.ArrayList;

public class TamGiac extends  DaGiac{

    public TamGiac(ArrayList<Integer> kichThuocCacCanh){
        super(3,kichThuocCacCanh);
    }

    public boolean kiemTraHopLe(){
        int a = getKichThuoc().get(0);
        int b = getKichThuoc().get(1);
        int c = getKichThuoc().get(2);
        return (a + b >c) && (a +c > b) && (b + c > c);
    }

    @Override
    public int tinhChuVi(){
        if(kiemTraHopLe()){
            return super.tinhChuVi();
        }else {
            System.out.println("Tam giac khong hop le");
            return 0;
        }
    }

    public double tinhDienTich(){
        if(kiemTraHopLe()){
            double p =(double) tinhChuVi()/2;
            double a = getKichThuoc().get(0);
            double b = getKichThuoc().get(1);
            double c = getKichThuoc().get(2);
            return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }else {
            System.out.println("Tam giac khong hop le");
            return 0;
        }
    }
    @Override
    public String toString(){
        return "Tam Giac {" +
                "KichThuoc = "+ getKichThuoc() +
                ", Dientich= "+ tinhDienTich() +
                ", Chuvi =" + tinhChuVi() + "}";
    }
}
