package BaiTapOOP_19;

public class main {
    public static void main(String[] args) {
        Diem d = new Diem(4,5);
        Diem d2 = new Diem(2,7);
        d.inDiem();

        System.out.println("khoang cach:"+d.khoangCach(d2));

        HinhTron hi = new HinhTron();
        HinhTron hi2 = new HinhTron(d, 7);

        System.out.println("Chu vi: "+hi2.tinhChuVi());
        System.out.println("Dien tich: "+hi2.tinhDienTich());
    }
}
