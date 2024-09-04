package BaiTapOOP_23;

public class SinX {
    private double x =Math.PI /4;
    private double sin_x = 0;
    private int n = 0;

    public SinX(int n) {
        this.n = n;
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getSin_x() {
        return sin_x;
    }

    public void setSin_x(double sin_x) {
        this.sin_x = sin_x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double tinhKetQuaSinX(){
        double term = x;
        while(Math.abs(term) > 1e-4){
            sin_x+=term;
            n++;
            term *= -x * x /((2 * n ) *(2 * n + 1));
        }
        return sin_x;
    }
}
