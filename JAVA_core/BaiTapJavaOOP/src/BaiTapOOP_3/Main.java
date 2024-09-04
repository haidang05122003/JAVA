package BaiTapOOP_3;

/*
Đề 1:
1. Xây dựng lớp phân số với hai thuộc tính riêng xác định tử số và mẫu số của phân số và xây dựng các
phương thức:
- Các toán tử tạo lập (constructor) trường hợp không có tham số và trường hợp có 2 tham số tử số và mẫu
số
- Các phép toán cộng, trừ, nhân, chia các phân số
- Phép kiểm tra một phân số có phải tối giản hay không
- Phép tìm dạng tối giản của phân số
2. Viết chương trình ứng dụng kiểm tra hoạt động của các phương thức

 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon = 0;
        do {
            System.out.println("-------MENU--------");
            System.out.println("1. Tinh tong 2 phan so");
            System.out.println("2. Tinh hieu 2 phan so");
            System.out.println("3. Tinh tich 2 phan so");
            System.out.println("4. Tinh thuong 2 phan so");
            System.out.println("5. Kiem tra toi gian ");
            System.out.println("6. Toi gian phan so ");
            luaChon = sc.nextInt();
            sc.nextLine();
            if (luaChon == 1) {
                System.out.println("nhap phan so thu 1: ");
                int tuSo = sc.nextInt();
                int maSo = sc.nextInt();
                System.out.println("nhap phan so thu 2: ");
                int tuSo2 = sc.nextInt();
                int maSo2 = sc.nextInt();
            PhanSo phanSo1 = new PhanSo(tuSo, maSo);
            PhanSo phanSo2 = new PhanSo(tuSo2, maSo2);
            phanSo1.congPhanSo(phanSo2);
            }
            else if (luaChon == 2) {
                System.out.println("nhap phan so thu 1: ");
                int tuSo = sc.nextInt();
                int maSo = sc.nextInt();
                System.out.println("nhap phan so thu 2: ");
                int tuSo2 = sc.nextInt();
                int maSo2 = sc.nextInt();
                PhanSo phanSo1 = new PhanSo(tuSo, maSo);
                PhanSo phanSo2 = new PhanSo(tuSo2, maSo2);
                phanSo1.truPhanSo(phanSo2);
            }
            else if (luaChon == 3) {
                System.out.println("nhap phan so thu 1: ");
                int tuSo = sc.nextInt();
                int maSo = sc.nextInt();
                System.out.println("nhap phan so thu 2: ");
                int tuSo2 = sc.nextInt();
                int maSo2 = sc.nextInt();
                PhanSo phanSo1 = new PhanSo(tuSo, maSo);
                PhanSo phanSo2 = new PhanSo(tuSo2, maSo2);
                phanSo1.nhanPhanSo(phanSo2);
            }
            else if (luaChon == 4) {
                System.out.println("nhap phan so thu 1: ");
                int tuSo = sc.nextInt();
                int maSo = sc.nextInt();
                System.out.println("nhap phan so thu 2: ");
                int tuSo2 = sc.nextInt();
                int maSo2 = sc.nextInt();
                PhanSo phanSo1 = new PhanSo(tuSo, maSo);
                PhanSo phanSo2 = new PhanSo(tuSo2, maSo2);
                phanSo1.chiaPhanSo(phanSo2);
            }
            else if (luaChon == 5) {
                System.out.println("Nhap vao phan so :");
                int tuSo = sc.nextInt();
                int maSo = sc.nextInt();
                PhanSo phanSo1 = new PhanSo(tuSo, maSo);
                phanSo1.kiemTraRutGon();
            }
            else if (luaChon == 6) {
                System.out.println("nhap vao phan so : ");
                int tuSo = sc.nextInt();
                int maSo = sc.nextInt();
                PhanSo phanSo1 = new PhanSo(tuSo, maSo);
                phanSo1.toiGianPhanSo();
            }
        } while (luaChon != 0);
    }
}
