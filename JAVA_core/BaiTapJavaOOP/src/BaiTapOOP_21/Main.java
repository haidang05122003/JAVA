package BaiTapOOP_21;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn1 = new HinhChuNhat(3,4);
        HinhChuNhat hcn2 = new HinhChuNhat(3,4);

        System.out.println("Chu vi hcn1 = "+hcn1.tinhChuVi());
        System.out.println("Chu vi hcn2 = "+hcn2.tinhChuVi());
        System.out.println("so sanh chu vi 2 hcn: "+ hcn2.equals(hcn1));
        System.out.println("so sanh chu vi 2 hcn: "+ hcn2.compareTo(hcn1));

        System.out.println("Dien tich hcn1 = " +hcn1.tinhDienTich());
        System.out.println("Dien tich hcn2 = " +hcn2.tinhDienTich());
        System.out.println("so sanh dien tich 2 hcn: "+ hcn1.equals(hcn2));
        System.out.println("so sanh dien tich 2 hcn: "+ hcn1.compareTo(hcn2));


    }
}
