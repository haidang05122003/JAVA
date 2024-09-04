import java.util.Scanner;

public class try_catch {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try{
            System.out.println("Nhap vao so nguyen N: ");
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("nhap du lieu khong dung");
        } finally {
            System.out.println("Finally");
        }
        System.out.println("Gia tri nhap vao la:" +n);
        System.out.println("Ket thuc chuong trinh");
    }
}
