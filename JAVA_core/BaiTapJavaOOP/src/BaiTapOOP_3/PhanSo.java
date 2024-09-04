package BaiTapOOP_3;

public class PhanSo {
    protected int tuSo;
    protected int mauSo;

    public PhanSo() {

    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public int timUCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void congPhanSo(PhanSo ps) {
        if (getMauSo() == ps.getMauSo()) {
            int TuSo = this.getTuSo() + ps.getTuSo();
            int MauSo = this.getMauSo();
            PhanSo congPhanSo = new PhanSo(TuSo, MauSo);
            System.out.println("Tong cua 2 phan so la: " + TuSo + "/" + getMauSo());
        } else {
            int TuSo = this.getTuSo() * ps.getMauSo() + ps.getTuSo() * this.getMauSo();
            int MauSo = this.getMauSo() * ps.getMauSo();
            PhanSo congPhanSo = new PhanSo(TuSo, MauSo);
            System.out.println("Tong cua 2 phan so la: " + TuSo + "/" + MauSo);
        }
    }

    public void truPhanSo(PhanSo ps) {
        if (getMauSo() == ps.getMauSo()) {
            int TuSo = this.getTuSo() - ps.getTuSo();
            int MauSo = this.getMauSo();
            PhanSo congPhanSo = new PhanSo(TuSo, MauSo);
            System.out.println("Hieu cua 2 phan so la: " + TuSo + "/" + getMauSo());
        } else {
            int TuSo = this.getTuSo() * ps.getMauSo() - ps.getTuSo() * this.getMauSo();
            int MauSo = this.getMauSo() * ps.getMauSo();
            PhanSo congPhanSo = new PhanSo(TuSo, MauSo);
            System.out.println("Hieu cua 2 phan so la: " + TuSo + "/" + MauSo);
        }
    }

    public void nhanPhanSo(PhanSo ps) {
        int TuSo = this.getTuSo() * ps.getTuSo();
        int MauSo = this.getMauSo() * ps.getMauSo();
        PhanSo congPhanSo = new PhanSo(TuSo, MauSo);
        System.out.println("Tich cua 2 phan so la: " + TuSo + "/" + MauSo);
    }

    public void chiaPhanSo(PhanSo ps) {
        int TuSo = this.getTuSo() * ps.getMauSo();
        int MauSo = this.getMauSo() * ps.getTuSo();
        PhanSo congPhanSo = new PhanSo(TuSo, MauSo);
        System.out.println("Thuong cua 2 phan so la: " + TuSo + "/" + MauSo);
    }

    public void toiGianPhanSo() {
        int i = timUCLN(this.getTuSo(), this.getMauSo());
        this.setTuSo(this.getTuSo() / i);
        this.setMauSo(this.getMauSo() / i);
        System.out.println("Phan so sau khi rut gon la:" + this.getTuSo() + "/" + this.getMauSo());
    }

    public boolean kiemTraRutGon()
    {
        if(timUCLN(this.getTuSo(), this.getMauSo()) == 1){
            System.out.println("Phan so da duoc rut gon");
        }else
            System.out.println("Phan so da chua duoc rut gon");
        return false;
    }
}




