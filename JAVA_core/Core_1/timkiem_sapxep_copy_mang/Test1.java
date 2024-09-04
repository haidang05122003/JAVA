package timkiem_sapxep_copy_mang;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        Sinhvien sv1 = new Sinhvien(150, "Tran Van Truong","Lop12",9);
        Sinhvien sv2 = new Sinhvien(100, "Truong Hung Ba Dung","Lop11",8);
        Sinhvien sv3 = new Sinhvien(199, "Nguyen Ngoc Linh","Lop11",7);
        Sinhvien sv4 = new Sinhvien(195, "Nguyen Van Binh","0",8.5);

        Sinhvien[] a_sv = new Sinhvien[]{sv1, sv2, sv3};

        System.out.println("Ban dau: "+Arrays.toString(a_sv));

        System.out.println();

        //ham sap xep
        Arrays.sort(a_sv);
        System.out.println("Sau khi sap xep: "+Arrays.toString(a_sv));

        System.out.println();

        //Ham tim kiem
        System.out.println("Tim kiem Linh: "+Arrays.binarySearch(a_sv,sv1));
        System.out.println("Tim kiem Binh: "+Arrays.binarySearch(a_sv,sv4));
    }
}
