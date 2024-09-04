package BaiTapOOP_21;


public class HinhChuNhat implements Comparable<HinhChuNhat> {
    private double cd, cr;

    public HinhChuNhat() {}

    public HinhChuNhat(double cd, double cr) {
        this.cd = cd;
        this.cr = cr;
    }

    public double getCd() {
        return cd;
    }

    public void setCd(double cd) {
        this.cd = cd;
    }

    public double getCr() {
        return cr;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }

    public double tinhChuVi(){
        return (cd + cr)/2;
    }

    public double tinhDienTich(){
        return cd * cr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HinhChuNhat that = (HinhChuNhat) o;
        return Double.compare(tinhChuVi(), that.tinhChuVi())
                == 0 && Double.compare(tinhDienTich(), that.tinhDienTich()) == 0;
    }

    @Override
    public int compareTo(HinhChuNhat o) {
        if(tinhDienTich() == o.tinhDienTich()){
            return 1;
        }else {
            return -1;
        }
    }
}
