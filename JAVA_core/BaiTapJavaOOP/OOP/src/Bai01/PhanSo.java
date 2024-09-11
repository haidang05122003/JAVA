package Bai01;

public class PhanSo {
    int ts, ms;

    public PhanSo(){
        ts = 0;
        ms = 1;
    }

    public PhanSo(int ts, int ms) {
        this.ts = ts;
        this.ms = ms;
    }

    public PhanSo congPS(PhanSo ps){
            int tsm = this.ts * ps.ms + this.ms * ps.ts;
            int msm = this.ms * ps.ms;
            return new PhanSo(tsm, msm);
    }

    public boolean ktToiGian(){
        if(ucln(ts,ms) == 1){
            System.out.println("Phan so da dc rut gon !");
        }else {
            System.out.println("Phan so chua dc rut gon !");
        }
        return false;
    }

    public int ucln(int a, int b){
        while(a != b){
            if(a>b){
                a-=b;
            }else {
                b -= a;
            }
        }
        return a;
    }

    public PhanSo rutGonPS(){
        int ucln = ucln(ms, ts);
        int tsm = (ts / ucln);
        int msm = (ms / ucln);
        return new PhanSo(tsm, msm);
    }

    public String inPS(){
        System.out.println(ts + "/" + ms);
        return ts + "/" + ms;
    }
}
