package book;

public class main {
    public static void main(String[]args) {
        Date date01 = new Date(25,12,2024);
        Date date02 = new Date(12,1,2023);
        Date date03 = new Date(3,5,2023);

        TacGia tacGia1 = new TacGia("Hoang Tung", date01);
        TacGia tacGia2 = new TacGia("Bui Tung", date02);
        TacGia tacGia3 = new TacGia("Le Tung", date03);

        book Book1 = new book("Lap trinh C", 500000,2023,tacGia1);
        book Book2 = new book("Lap trinh JAVA", 700000,2022,tacGia2);
        book Book3 = new book("Lap trinh Python", 200000,2022,tacGia3);

        Book1.inTenSach();
        Book2.inTenSach();
        Book3.inTenSach();

        System.out.println("So sanh sach 1 va 2: " +Book1.kiemTraCungNamXB(Book2));
        System.out.println("So sanh sach 2 va 3: " +Book2.kiemTraCungNamXB(Book3));

        System.out.println("Sach 1 giam gia 10% :" +Book1.giaSauGiam(10));
        System.out.println("Sach 2 giam gia 20% :" +Book2.giaSauGiam(20));
        System.out.println("Sach 3 giam gia 30% :" +Book3.giaSauGiam(30));
    }
}
