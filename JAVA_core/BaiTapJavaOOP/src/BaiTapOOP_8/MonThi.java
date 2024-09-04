package BaiTapOOP_8;

public class MonThi extends ThongTin{
    private String mon;

    public MonThi(String mon) {
        this.mon = mon;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    @Override
    public String toString() {
        return "," + "KhoiThi='" + mon + '\'' + '}';
    }
}
