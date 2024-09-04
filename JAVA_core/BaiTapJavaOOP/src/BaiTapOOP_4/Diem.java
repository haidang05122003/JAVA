package BaiTapOOP_4;

public class Diem {
    float x, y;

    public Diem() {

    }

    public Diem(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float khoangCach(Diem d) {
       float kc = (float)Math.sqrt((this.x -d.x) * (this.x - d.x) + (this.y - d.y)*(this.y - d.y));
       return kc;
    }

    public void inDiem() {
        System.out.println("Diem co toa do: " +" (" + x +","+y+" )");
    }
}
