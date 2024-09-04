package BaiTapOOP_22;

public class TamGiac {
    private double a, b, c;

    public TamGiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public boolean dieuKien() {
        return a + b > c && b + c > a && c + a > b;
    }

    public double chuVi() {
        return a + b + c;
    }

    public double dienTich() {
        double P = chuVi() / 2;
        return Math.sqrt(P * (P - a) * (P - b) * (P - c));
    }

    @Override
    public String toString() {
        if (dieuKien()) {
            return String.format("Cạnh a: %.2f, b: %.2f, c: %.2f\nChu vi: %.2f\nDiện tích: %.2f\n\n",
                    a, b, c, chuVi(), dienTich());
        } else {
            return String.format("Cạnh a: %.2f, b: %.2f, c: %.2f không tạo thành một tam giác.\n\n", a, b, c);
        }
    }
}
