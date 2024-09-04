package Bai_tap_chuoi3;

public class vidu {
    public static void main(String[] args) {
        String s1 = "haiDaNg";
        String s2 = "Hoang";

        String s3 = s1 + s2;
        //ham con cat ==> noi chuoi
        String s4 = s1.concat(s2);
        System.out.println("s3= "+s3);
        System.out.println("s4= "+s4);

        System.out.println();

        //ham replace ==> thay the
        String s5 ="Dang.vn";
        String s6 =  s5.replaceAll("Dang","Hai" );
        System.out.println("s6 = " + s6);

        System.out.println();
        //toLowerCase ==> chuyen ve viet thuong
        //toUpperCase ==> chuyen ve viet Hoa

        String s7 = s3.toLowerCase();
        String s8 = s3.toUpperCase();
        System.out.println("s7 = " + s7);
        System.out.println("s8 = " + s8);

        System.out.println();

        //trim() xoa khoang trang du thua o dau chuoi
        String s9 = " Xin chao cac ban, toi la dang    ";
        System.out.println(s9.trim());

        System.out.println();

        //subString ==> cat chuoi con
        String s10 = "Xin chao cac ban, toi la dang";
        String s11 = s10.substring(8);
        String s12 = s10.substring(8,20);
        System.out.println("s11: "+ s11);
        System.out.println("s12: "+s12);
    }
}
