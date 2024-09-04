package Lop_doi_tuong_bien_phuong_thuc_tinh;

class Math
{
    public static double PI = 3.14;

    public static int abs(int x)
    {
        return x < 0 ?-x : x;
    }
    public static int add(int x, int y)
    {
        return x + y;
    }
    public static int subtract(int x, int y)
    {
        return x - y;
    }
    public static int min(int x, int y)
    {
        if(x<y)
        {
            return x;
        }
        else
            return y;
    }
    public static int max (int x, int y)
    {
        if(x>y)
        {
            return x;
        }
        else
            return y;
    }
    public static int pow (int x, int y)
    {
        int power = 1;
        for(int i = 0; i < y; i++)
        {
            power*=x;
        }
        return power;
    }
    public static int sqrt(int num) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sqrt'");
    }

}
public class LTHDT_lopMath 
{
    public static void main(String[] args) 
    {
        System.out.println(Math.PI);
		System.out.println(Math.abs(-2));
		System.out.println(Math.add(2, 3));
		System.out.println(Math.subtract(2, 3));
		System.out.println(Math.min(2, 3));
		System.out.println(Math.max(2, 3));
		System.out.println(Math.pow(2, 3));
    }
}
