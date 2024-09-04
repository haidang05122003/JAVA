package bai_tap;
class Base {

    public void total() {
        show();
    }

    public void show() {
        System.out.println("Base");
    }
}

class Derived extends Base {

    public void show() {
        System.out.println("Derived");
    }
}

public class bai_tap_ke_thua {
    public static void main(String[] args) {
        Base d = new Derived();
        d.total();
    }
}
