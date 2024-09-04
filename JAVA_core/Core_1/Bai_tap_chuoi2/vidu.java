package Bai_tap_chuoi2;

public class vidu {
    public static void main(String[] args) {
        String s1 = "Xin chao moi nguoi, xin chao cac ban !!, Xin chao";
        String s2 = "Xin chao";
        String s3 = "Xin chao 123";
        char c1 = 'o';

        //ham indexOf
        System.out.println("vi tri cua s2 trong s1 la: "+s1.indexOf(s2));
        System.out.println("vi tri cua s3 trong s1 la: "+s1.indexOf(s3));

        System.out.println();

        //Su dung vi tri bat dau
        System.out.println("vi tri cua s2 trong s1 la: "+s1.indexOf(s2,2));

        System.out.println();

        //tim kiem char
        System.out.println("vi tri cua s2 trong s1 la: "+ s1.indexOf(c1));
        System.out.println("vi tri cua s3 trong s1 la: "+ s1.indexOf(c1,20));

        System.out.println();
        //ham tim kiem lastIndexof ==> tim kiem tu phai sang trai
        System.out.println("vi tri cua s2 trong s1 la (Phai sang trai): "+s1.lastIndexOf(s2));

        //tenFile = "Bai Tap.excel.lop12.xls"; (vi du)
    }
}
