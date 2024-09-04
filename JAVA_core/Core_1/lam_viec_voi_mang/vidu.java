package lam_viec_voi_mang;

import java.util.Arrays;

public class vidu {
    public static void main(String[] args) {
        //kieu du lieu nguyen thuy
        int[] mang1 = {1,2,3};

        //copy mang
        int[] mang1_a = mang1;
        mang1_a[0] = 100;

        System.out.println("mang1: "+ Arrays.toString(mang1));
        System.out.println("mang1_a: "+ Arrays.toString(mang1_a));

        //copy mang cach 1 - dung ham clone
        int[] mang1_b = mang1.clone();
        mang1_b[0] = 50;
        System.out.println("mang1_b: "+ Arrays.toString(mang1_b));

        //su dung System.arraycopy
        int[] mang1_c = new int[mang1.length];
        System.arraycopy(mang1,0,mang1_c,0, mang1.length);
        mang1_c[0] = 90;
        System.out.println("mang1_c: "+ Arrays.toString(mang1_c));

        System.out.println();

        //kieu du lieu doi tuong
        String[] mang_doi_tuong = {"Dang", ".vn"};

        //copy mang
        String[] mang2_a = mang_doi_tuong;
        mang_doi_tuong[0] = "Tung";

        System.out.println("mang_doi_tuong: "+ Arrays.toString(mang_doi_tuong));
        System.out.println("mang2: "+ Arrays.toString(mang2_a));

        //copy mang cach 1 - dung ham clone
        String[] mang2_b = mang_doi_tuong.clone();
        mang2_b[0] = "Hung";
        System.out.println("mang_doi_tuong: "+ Arrays.toString(mang_doi_tuong));
        System.out.println("mang2_b: "+ Arrays.toString(mang2_b));

        //su dung System.arraycopy
       String[] mang2_c = new String[mang_doi_tuong.length];
       System.arraycopy(mang_doi_tuong,0,mang2_c,0,mang_doi_tuong.length);
       mang2_c[0] = "Minh";
       System.out.println("mang_doi_tuong: "+ Arrays.toString(mang_doi_tuong));
       System.out.println("mang2_c: "+ Arrays.toString(mang2_c));


    }
}
