package BaiTapOOP_19;

public class HinhTron {
    private int bk;
    private Diem d;

    public HinhTron(){}

    public HinhTron(int bk, Diem d){
        this.bk = bk;
        this.d = d;
    }

    public HinhTron(Diem d, int bk) {
        this.d = d;
        this.bk = bk;
    }

    public int getBk() {
        return bk;
    }

    public void setBk(int bk) {
        this.bk = bk;
    }

    public Diem getD() {
        return d;
    }

    public void setD(Diem d) {
        this.d = d;
    }

    public double tinhChuVi(){
        return 2 * Math.PI * bk;
    }

    public double tinhDienTich(){
        return Math.PI * Math.pow(bk, 2);
    }
}
