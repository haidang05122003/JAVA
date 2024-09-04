package bai_tap_kethua_abstract_OOP;

public class Test {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("hang 1", "Viet Nam");
        HangSanXuat h2 = new HangSanXuat("hang 2", "Japan");
        HangSanXuat h3 = new HangSanXuat("hang 3", "USA");

        MayBay pt1 = new MayBay(h3,"xang");
        PhuongTienDiChuyen pt2 = new XeOto(h2,"dau");
        PhuongTienDiChuyen pt3 = new XeDap(h1);

        System.out.println("Lay Hang san xuat:");
        System.out.println("pt1: "+ pt1.layTenHangSanXuat());
        System.out.println("pt2: "+ pt2.layTenHangSanXuat());
        System.out.println("pt3: "+ pt3.layTenHangSanXuat());


        System.out.println("Bat Dau:");
        pt1.BatDau();

        System.out.println("Lay van toc: ");
        System.out.println("Lay van toc pt1: "+ pt1.layVanToc());
        System.out.println("Lay van toc pt2: "+pt2.layVanToc());
        System.out.println("Lay van toc pt3: "+pt3.layVanToc());

        System.out.println("Chuan bi cat canh:");
        pt1.catCanh();

        System.out.println("Chuan bi ha canh:");
        pt1.haCanh();

    }
}
