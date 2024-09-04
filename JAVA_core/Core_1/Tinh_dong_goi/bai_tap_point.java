package Tinh_dong_goi;

class Point
{
    private double x,y;

    public Point() {

    }
    public Point( double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getX() {
        return x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getY() {
        return y;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(double x, double y) {
        return Math.sqrt((this.x - x)*(this.x - x)+(this.y - y)*( this.y - y));
    }
    public double distance(Point another) {
        return distance(another.getX(), another.getY());
    }

}
public class bai_tap_point {
    public static void main(String[] args) {
        Point p1 = new Point(2,6);
        Point p2 = new Point(5,7);
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(2.5, 2.7));
    }
}
/* 
 Cho ban nào chưa hiểu thì this.x và this.y trong distance(double x, double y) là giá trị của đối tượng p1 còn x , y 
là giá trị của p2 truyền vào nhé  / Còn distance (Point another) là biến another có kiểu dữ liệu point (kiểu dữ liệu ng dùng tự định nghĩa) 
 .return distance(another.getX(), another.getY()); có nghĩa là gọi đến hàm distance(double x, double y) và trả về giá trị . another.gexX() 
 và another.getY() là lấy giá trị truyền vào thông qua phương thức getX, get Y cho 2 biến x , y ở hàm distance(double x, double y) , 
 còn this.x và this,y lúc này vẫn là giá trị của p1 Thực chất thì 2 phương thức distance này có tác dụng như nhau ,
thâm chí là có thể bỏ distance(Point another) vì distance(double x, double y ) đã quá đủ cho mọi trường hợp . 
 Nhưng distance (point another) nó lại rất tiện cho những trường hợp khác , ví dụ như so sánh 1 điểm đang có sẵn với 1 điểm khác thì 
 chỉ cần truyền giá trị điểm khác vào , chứ k cần truyền giá trị cho cả 2 điểm à còn tại sao 2 phương thức có tên giống nhau thì là
  nạp chồng phương thức nhé
 */