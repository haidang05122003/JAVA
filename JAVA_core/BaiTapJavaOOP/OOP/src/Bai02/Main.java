package Bai02;

public class Main {
    public static void main(String[] args) {
        Diem A = new Diem();
        Diem B = new Diem(3,0);
        Diem C = new Diem(0,4);
        A.inDiem();
        B.inDiem();
        C.inDiem();
        TamGiac tamGiac = new TamGiac(A,B,C);
        System.out.println("Dien tich tam giac la "+tamGiac.dienTich());
        System.out.println("Chu vi tam giac la "+tamGiac.chuVi());

    }
}
