package Tinh_da_hinh_truu_tuong;

interface IShape
{
    double getArea();
    double getPerimeter();
}
class Rectangle implements IShape
{
    private double length, width;
    public Rectangle (double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return width * length;
    }
    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }
}
class Circle implements IShape
{
    private double radius;
    public Circle( double radius) {
        super();
        this.radius = radius;
    }
    @Override
    public double getArea () {
        return radius * radius * 3.14;
    }
    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }
}
public class Hinh_tron_truu_tuong {
    public static void main(String[] args) {
        IShape []shapes = new IShape[3];
        shapes[0] = new Rectangle(3.7, 4.5);
        shapes[1] = new Circle(10.0);
        shapes[2] = new Rectangle(2, 8);
        for(int i = 0; i<3; i++) {
            System.out.println("Area of shapes [" + i + "]: " + shapes[i].getArea());
            System.out.println("Perimeter of shapes ["+ i + "]: " + shapes[i].getPerimeter());
        }
    }
}
