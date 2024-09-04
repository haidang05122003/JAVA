package Phuong_Thuc_So_Sanh_compareTo;

public class vidu {
    public static void main(String[] args) {
        Sinhvien sv1 = new Sinhvien(150, "Tran Van Truong","Lop12",9);
        Sinhvien sv2 = new Sinhvien(100, "Truong Hung Ba Dung","Lop11",8);
        Sinhvien sv3 = new Sinhvien(199, "Nguyen Ngoc Linh","Lop11",7);

        System.out.println(sv1.compareTo(sv2));
        System.out.println(sv2.compareTo(sv3));
        System.out.println(sv3.compareTo(sv1));
    }
}
