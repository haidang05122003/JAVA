package Tinh_da_hinh_truu_tuong;

class Superclass
{
    int x = 10;
    public void display() {
        System.out.println(x);
    }
}
class Subclass extends Superclass 
{
    int x = 20;
    @Override
    public void display() {
        System.out.println(x);
    }
}

public class bai_tap_Variable_hiding {
    public static void main(String[] args) {
        Superclass sp = new Subclass();
        System.out.println(sp.x);
        sp.display();
    }
}
