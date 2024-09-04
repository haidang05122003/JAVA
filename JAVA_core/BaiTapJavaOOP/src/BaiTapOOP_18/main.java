package BaiTapOOP_18;

public class main {
    public static void main(String[] args) {
        Diem A = new Diem(0, 0);
        Diem B = new Diem(3, 0);
        Diem C = new Diem(0, 4);

        TamGiac tamGiac = new TamGiac(A,B,C);


        System.out.println("AB : "+ A.khoangCach(B));
        System.out.println("AC : "+A.khoangCach(C));

        System.out.println("Chu vi: "+tamGiac.chuVi());
        System.out.println("Dien tich: "+tamGiac.dienTich());
    }
}
