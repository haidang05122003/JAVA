package film;

public class main {
    public static void main(String[]args){
        NgayChieu ngay1 = new NgayChieu(25,11,2024);
        NgayChieu ngay2 = new NgayChieu(11,9,2024);
        NgayChieu ngay3 = new NgayChieu(13,4,2024);

        HangSanXuat hangSX1 = new HangSanXuat("Mavel", "My");
        HangSanXuat hangSX2 = new HangSanXuat("Pixel", "Anh");
        HangSanXuat hangSX3= new HangSanXuat("1Box", "Nhat");

        BoPhim boPhim1 = new BoPhim("Iron man 1",2008,hangSX1,80000,ngay1);
        BoPhim boPhim2 = new BoPhim("Chuot dau bep",2012,hangSX2,60000,ngay2);
        BoPhim boPhim3 = new BoPhim("Your name",2019,hangSX3,100000,ngay3);

        System.out.println("So sanh gia ve cua boPhim1 va boPhim 2: "+boPhim1.kiemTraGiaVe(boPhim2));
        System.out.println("So sanh gia ve cua boPhim1 va boPhim 3: "+boPhim1.kiemTraGiaVe(boPhim3));

        System.out.println("Ten hang san xuat phim 1: " + boPhim1.layTenHangSX());
        System.out.println("Ten hang san xuat phim 2: " + boPhim2.layTenHangSX());
        System.out.println("Ten hang san xuat phim 3: " + boPhim3.layTenHangSX());

        System.out.println("gia ve sau giam gia phim 1: " + boPhim1.sauGiamGiaSX(10));
        System.out.println("gia ve sau giam gia phim 2: " + boPhim2.sauGiamGiaSX(20));
        System.out.println("gia ve sau giam gia phim 3: " + boPhim3.sauGiamGiaSX(30));

    }
}
