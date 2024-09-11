package Bai02;

public class Diem {
    float x,y;

    public Diem(){
        x = 0;
        y = 0;
    }

    public Diem(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float khoangcach(Diem d){
        float kc = (float)Math.sqrt((x - d.x)*(x - d.x) +(y - d.y)*(y - d.y));
        return kc;
    }

    public String inDiem(){
        System.out.println("(" + x + "," + y + ")");
        return "(" + x + "," + y + ")";
    }
}
