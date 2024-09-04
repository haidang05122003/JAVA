package Lop_doi_tuong_bien_phuong_thuc_tinh;

class Circle
{
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double getArea()
    {
        return radius * radius * 3.14;
    }
    public double getCircumference()
    {
        return radius * 2 * 3.14;
    }
}
public class LTDHT_hinhtron 
{
    public static void main(String[] args) 
    {
        Circle c = new Circle(7);
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }
}
