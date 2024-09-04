package bai_tap;

class A
{
    public int x = 10;
        public void display() {
            System.out.println(this.x);
        }
}
class B extends A
{
    public int x = 20;
}
public class method_hiding {
    public static void main(String[] args) {
        A b = new A();
        b.display();
    }
}
