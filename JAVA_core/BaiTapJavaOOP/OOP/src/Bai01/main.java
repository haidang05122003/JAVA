package Bai01;

public class main {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo();
        ps1.inPS();
        PhanSo ps2 = new PhanSo(3, 5);
        ps2.inPS();
        PhanSo ps3 = new PhanSo(8,18);
        PhanSo ps4 = new PhanSo(6, 16);
        PhanSo pst = ps3.congPS(ps4);
        pst.inPS();
        PhanSo ps6 = new PhanSo(6, 12);
        PhanSo psrg = ps6.rutGonPS();
        psrg.inPS();


    }
}
