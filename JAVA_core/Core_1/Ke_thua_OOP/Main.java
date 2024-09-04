package Ke_thua_OOP;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kiem tra:");
        ConNguoi cn = new ConNguoi("Dang", 2005);
        cn.An();
        cn.Uong();
        cn.Ngu();

        HocSinh hs = new HocSinh("Mai",2003,"12a3","THPT A");
        hs.An();
        hs.Uong();
        hs.Ngu();
        hs.LambaiTap();
    }
}
