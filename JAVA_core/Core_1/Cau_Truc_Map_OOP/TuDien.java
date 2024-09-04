package Cau_Truc_Map_OOP;

import java.util.*;

public class TuDien {
    //Map chua 1 key va 1 value
    private Map<String, String> duLieu = new TreeMap<String, String>();   // Sap Xep lai cac key trong mang theo thu tu
    //private Map<String, String> duLieu = new HashMap<String, String>(); //Khong sap xep theo thu tu

    public String themTu(String tuKhoa, String yNghia) {
        return this.duLieu.put(tuKhoa, yNghia);
    }

    public String xoaTu(String tuKhoa) {
        return this.duLieu.remove(tuKhoa);
    }

    public String traTu(String tuKhoa) {
        String yNghia = this.duLieu.get(tuKhoa);
        return yNghia;
    }

    public void inTuKhoa() {
        Set<String> tapHopTuKhoa = this.duLieu.keySet();
        System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
    }

    public int laySoLuong() {
        return this.duLieu.size();
    }

    public void xoaTatCa() {
        this.duLieu.clear();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuDien tuDien = new TuDien();
        int luaChon = 0;
        do {
            System.out.println("---------------");
            System.out.println(" MENU ");
            System.out.println("1. Them tu (tu khoa, y nghia");
            System.out.println("2. Xoa Tu ");
            System.out.println("3. Tim y nghia cua tu khoa ");
            System.out.println("4. In ra danh sach tu khoa ");
            System.out.println("5. In ra so luong tu ");
            System.out.println("6. Xoa ta ca tu khoa ");
            System.out.println("0. Thoat chuong trinh ");
            luaChon = sc.nextInt();
            sc.nextLine();

            if (luaChon == 1) {
                System.out.print("Nhap vao tu khoa: ");
                String tuKhoa = sc.nextLine();
                System.out.print("Nhap vao y nghia: ");
                String yNghia = sc.nextLine();
                tuDien.themTu(tuKhoa, yNghia);
            } else if (luaChon == 2 || luaChon == 3) {
                System.out.print("Nhap vao tu khoa: ");
                String tuKhoa = sc.nextLine();
                if (luaChon == 2) {
                    tuDien.xoaTu(tuKhoa);
                }else{
                    System.out.print("Y Nghia: "+tuDien.traTu(tuKhoa));
                }
            } else if (luaChon == 4) {
                tuDien.inTuKhoa();
            } else if (luaChon == 5) {
                System.out.println("Y nghia la: "+tuDien.laySoLuong());
            } else if (luaChon == 6) {
                tuDien.xoaTatCa();
            }
        } while (luaChon != 0);
    }
}