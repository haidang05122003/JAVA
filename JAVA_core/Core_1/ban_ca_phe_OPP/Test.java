package ban_ca_phe_OPP;

public class Test {
    public static void main(String[] args) {
        HoaDonCaPhe hd = new HoaDonCaPhe("Trung nguyen",100000,1.5);
        HoaDonCaPhe hd1 = new HoaDonCaPhe("Trung Nguyen",100000,5.5);
        System.out.println("Tong tien: "+ hd.TongTien());
        System.out.println("Kiem tra khoi luong > 2kg: "+hd.kiemTraKhoiLuongLonHon(2));
        System.out.println("Kiem tra khoi luong > 2kg: "+hd.kiemTraKhoiLuongLonHon(1));
        System.out.println("Kiem tra tong tien > 500k: "+hd.kiemTraTongTienLonHon500());
        System.out.println("Kiem tra giam gia vs hd >500k: " +hd.giamGia(10));
        System.out.println("Kiem tra giam gia vs hd >500k: " +hd1.giamGia(10));
        System.out.println("Kiem tra tong tien sau giam gia: " + hd1.giaSauKhiGiam(10));
        System.out.println("Kiem tra tong tien sau giam gia: " + hd.giaSauKhiGiam(10));

    }
}
