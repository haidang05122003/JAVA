package Kieu_Enum;

public class Main {
    public static void main(String[] args) {
        ThoiKhoaBieu tkb_t2  = new ThoiKhoaBieu(Test.Monday, "Toan, Ly, Hoa");
        ThoiKhoaBieu tkb_t3  = new ThoiKhoaBieu(Test.Tuesday, "Van, Su, Toan");
        ThoiKhoaBieu tkb_t4  = new ThoiKhoaBieu(Test.Wednesday, "Van, Dia, Toan");
        ThoiKhoaBieu tkb_t5  = new ThoiKhoaBieu(Test.Thursday, "Dia, Van, Hoa");
        ThoiKhoaBieu tkb_t6  = new ThoiKhoaBieu(Test.Friday, "Sinh, Hoa, Ly");
        ThoiKhoaBieu tkb_t7  = new ThoiKhoaBieu(Test.Saturday, "Van, GDCD, Toan");
        System.out.println(tkb_t5);

        int x = Thang.thang1.soNgay();
        System.out.println(x);
    }
}
