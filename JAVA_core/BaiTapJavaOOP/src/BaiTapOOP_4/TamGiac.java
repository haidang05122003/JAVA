package BaiTapOOP_4;

public class TamGiac extends Diem{
    private Diem A;
    private Diem B;
    private Diem C;

    public TamGiac(){

    }

    public TamGiac (Diem A, Diem B, Diem C){
        this.A = A;
        this.B = B;
        this.C = C;
    }
    public TamGiac(float x, float y, Diem a, Diem b, Diem c) {
        super(x, y);
        this.A = a;
        this.B = b;
        this.C = c;
    }

    public Diem getA() {
        return A;
    }

    public void setA(Diem a) {
        this.A = a;
    }

    public Diem getB() {
        return B;
    }

    public void setB(Diem b) {
        this.B = b;
    }

    public Diem getC() {
        return C;
    }

    public void setC(Diem c) {
        this.C = c;
    }

    public float dienTich() {
        float AB = A.khoangCach(B);
        float BC = B.khoangCach(C);
        float CA = C.khoangCach(A);
        float p = (AB + BC + CA) / 2;
        return (float) Math.sqrt(p * (p - AB) * (p - BC) * (p - CA));
    }

    public float chuVi() {
        float AB = A.khoangCach(B);
        float BC = B.khoangCach(C);
        float CA = C.khoangCach(A);
        return AB + BC + CA ;
    }
}
