package BaiTapOOP_17;

import java.util.ArrayList;

public class DaGiac {
    private int soCanh;
    private ArrayList<Integer> kichThuoc;

    public DaGiac(int soCanh, ArrayList<Integer> kichThuoc) {
        this.soCanh = soCanh;
        this.kichThuoc = kichThuoc;
    }

    public int getSoCanh() {
        return soCanh;
    }

    public void setSoCanh(int soCanh) {
        this.soCanh = soCanh;
    }

    public ArrayList<Integer> getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(ArrayList<Integer> kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public int tinhChuVi(){
        int chuVi = 0;
        for(int canh : kichThuoc){
            chuVi += canh;
        }
        return chuVi;
    }

    public void inRaCacCanh(){
        System.out.print("Cac canh cua da giac: ");
        for(int canh : kichThuoc){
            System.out.print(canh + " ");
        }
        System.out.println();
    }
}
