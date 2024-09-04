package Moi_quan_he_doi_tuong;

import java.util.ArrayList;
import java.util.List;

class Point2
{
    private int x, y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
}
class Polyline
{
    private List<Point2> points;
    
    public Polyline() {
        points = new ArrayList<Point2>();
    }
    public Polyline(List<Point2> points) {
        this.points = points;
    }
    public void appendPoint(Point2 point) {
        points.add(point);
    }
    public void appendPoint(int x, int y) {
        points.add(new Point2(x, y));
    }
    public double getLength() {
        double length = 0;
        for(int i = 0; i<points.size() - 1; i++) {
            int x1 = points.get(i).getX();
            int y1 = points.get(i).getY();
            int x2 = points.get(i+1).getX();
            int y2 = points.get(i+1).getY();
            double distance = Math.sqrt((x2 - x1) * (y2 - y1) + (y2 - y1) * (y2 - y1));
            length += distance;
        }
        return length;
    }
}
public class bai_tap_Point_PolyLine {
    public static void main(String[] args) {
        Polyline pl = new Polyline();
        pl.appendPoint(new Point2(1, 1));
        pl.appendPoint(new Point2(2, 3));
        pl.appendPoint(3, 0);
        pl.appendPoint(4, 2);
        System.out.println(pl.getLength());
    }
}
