package BaiTapOOP_1;

public class ChuVi extends TamGiac{

    public ChuVi(double a, double b, double c) {
        super(a, b, c);
    }

    public ChuVi() {

    }

    public double chuViTamGiac(TamGiac tamGiac) {
        return tamGiac.getA() + tamGiac.getB() + tamGiac.getC();
    }
}
