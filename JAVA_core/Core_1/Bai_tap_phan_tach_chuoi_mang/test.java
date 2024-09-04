package Bai_tap_phan_tach_chuoi_mang;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String s = "Xin chao cac ban, toi la Anine";

        String[] a = s.split(" ");

        System.out.println(Arrays.toString(a));

        String[] b = s.split(",");

        System.out.println(Arrays.toString(b));

        String s2 = "Xin chao, Toi la. 1 lap trinh vien";

        String[] c = s2.split("\\.|\\,");
        System.out.println(Arrays.toString(c));

        String s3 = "Nguyen Van A";
        String[] d = s3.split(" ");
        System.out.println(Arrays.toString(d));
        System.out.println("Ten:"+d[d.length - 1]);
    }
}
