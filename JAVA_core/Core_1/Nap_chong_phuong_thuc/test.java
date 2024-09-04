package Nap_chong_phuong_thuc;

public class test {
    public static void main(String[]args) {
        MyMath mm = new MyMath();
        System.out.println("min int: " +mm.timMin(4,1));
        System.out.println("min double: "+mm.timMin(4.6,1.2));
        System.out.println("Tinh tong:"+ mm.tinhTong(5.5,6.5));
        double arr[] = new double[] {1,2,3,4,5,1,1};
        System.out.println("tinh tong cua arr[]: "+mm.tinhTong(arr));


    }
}
