package BaiTapOOP_19;

public class Diem {
    protected double x,y;

    public Diem(){
        this.x=0;
        this.y=0;
    }

    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void inDiem(){
        System.out.println( "( "+ x + ", " + y + " )");
    }

    public double khoangCach(Diem d){
        double kc = Math.sqrt((this.x - d.x)*(this.x - d.x) + (this.y - d.y)*(this.y - d.y));
        return kc;
    }
}
