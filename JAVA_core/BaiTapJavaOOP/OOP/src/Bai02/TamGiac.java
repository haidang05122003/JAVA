package Bai02;

public class TamGiac extends Diem{
    private Diem A;
    private Diem B;
    private Diem C;

    public TamGiac(){

    }

    public TamGiac(Diem A, Diem B, Diem C){
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public float dienTich(){
        float AB = A.khoangcach(B);
        float BC = B.khoangcach(C);
        float CA = C.khoangcach(A);
        float p =  (AB + BC + CA)/2;
        float dt = (float)Math.sqrt(p*(p-AB)*(p-BC)*(p-CA));
        return dt;
    }

    public float chuVi(){
        float AB = A.khoangcach(B);
        float BC = B.khoangcach(C);
        float CA = C.khoangcach(A);
        return (AB + BC + CA);
    }
}
