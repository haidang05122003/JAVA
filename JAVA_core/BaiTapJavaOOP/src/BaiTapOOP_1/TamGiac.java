package BaiTapOOP_1;

public class TamGiac {
    private double a,b,c;

    public TamGiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public TamGiac() {

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void dieuKien() {
        if(a + b > c || a - b > c || b + c > a){
            System.out.println("Thoa man dieu kien ");
        }else{
            System.out.println("Khong thoa man dieu kien ");
        }
    }
}
