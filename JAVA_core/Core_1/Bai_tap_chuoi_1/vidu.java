package Bai_tap_chuoi_1;

public class vidu {
    public static void main(String[] args) {
        String s1 = "HoangHaiDang";
        String s2 = "hoangHaiDang";
        String s3 = "hoangHaiDang";

        //ham Equals ==> so sanh 2 chuoi giong nhau, co phan biet Hoa Thuong
        System.out.println("S1 equals s2: "+s1.equals(s2));
        System.out.println("S2 equals s3: "+s2.equals(s3));

        System.out.println();

        //ham EqualsIgnoreCase ==> so sanh 2 chuoi giong nhau,khong phan biet chu hoa va chu thuong chi quan tam
        // den noi dung co giong nhau hay khong
        System.out.println("S1 equals s2: "+s1.equalsIgnoreCase(s2));
        System.out.println("S2 equals s3: "+s2.equalsIgnoreCase(s3));

        System.out.println();

        //ham CompareTo ==> so sanh > < = tra ve 3 gia tri (am la [<] , duong la [>], 0 la [=] )
        //dua tren ki tu dau tien giua 2 chuoi

        String sv1 = "Nguyen van A";
        String sv2 = "Nguyen van B";
        String sv3 = "Nguyen van ";
        String sv4 = "Nguyen van a";

        System.out.println("sv1 compareTo sv2 :"+ sv1.compareTo(sv2));
        System.out.println("sv1 compareTo sv3 :"+ sv1.compareTo(sv3));
        System.out.println("sv1 compareTo sv4 :"+ sv1.compareTo(sv4));

        System.out.println();
        //CompareToIgnoreCase ==> tuong tu ham compareTo,khong phan biet in hoa hoac thuong, cho phep xem chuoi nao lon hon
        System.out.println("sv1 compareTo sv2 :"+ sv1.compareToIgnoreCase(sv2));
        System.out.println("sv1 compareTo sv3 :"+ sv1.compareToIgnoreCase(sv3));
        System.out.println("sv1 compareTo sv4 :"+ sv1.compareToIgnoreCase(sv4));

        //Ham regionMatches =>so sanh 1 doan ngan trong chuoi
        String r1  = "HaiDang";
        String r2  = "Dang";

        System.out.println();

        boolean check  = r1.regionMatches(3,r2, 0,4);
        System.out.println(check);

        //dung de kiem tra sdt thuoc nha mang nao (vidu)

        System.out.println();

        //ham stratWith ==> kiem tra chuoi bat dau bang
        String sdt = "037141566";
        System.out.println(sdt.startsWith("037"));
        System.out.println(sdt.startsWith("039"));

        System.out.println();
        //ham endWith ==> kiem tra chuoi ket thuc bang
        String tenFile = "Cat.JPG";
        String tenFile2 = "Vidu.java";

        if(tenFile.endsWith(".JPG")) {
            System.out.println("File anh");
        }else if(tenFile.endsWith(".java")) {
            System.out.println("File java");
        }

        if(tenFile2.endsWith(".JPG")) {
            System.out.println("File2 anh");
        }else if(tenFile2.endsWith(".java")) {
            System.out.println("File2 java");
        }




    }
}
