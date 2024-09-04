package BaiTapOOP_1;

public class DienTich extends TamGiac{

    public DienTich(double a, double b, double c) {
        super(a, b, c);
    }

    public DienTich() {

    }

    public double dienTichTamGiac(TamGiac tamGiac) {
        double p = (tamGiac.getA()+tamGiac.getB()+tamGiac.getC())/2;
        return  Math.sqrt(p*(p-tamGiac.getA())*(p-tamGiac.getB())*(p-tamGiac.getC()));
    }
}
