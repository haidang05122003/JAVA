package Lop_doi_tuong_bien_phuong_thuc_tinh;

class ArrayCalculator1
{
    public static int maxOfArray (int arr[])
    {
        int MaxValue = arr[0];
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] > MaxValue)
            {
                MaxValue = arr[i];
            }
        }
        return MaxValue;
    }
    public static double maxOfArray(double arr[])
    {
        double MaxValue = arr[0];
        for(int i = 0 ; i< arr.length; i++)
        {
            if(arr[i] > MaxValue)
            {
                MaxValue = arr[i];
            }
        }
        return MaxValue;
    }
    public static int minOfArray(int arr[])
    {
        int MinValue = arr[0];
        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i] < MinValue)
            {
                MinValue = arr[i];
            }
        }
        return MinValue;
    }
    public static double minOfArray(double arr[])
    {
        double MinValue = arr[0];
        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i] < MinValue)
            {
                MinValue = arr[i];
            }
        }
        return MinValue;
    }
}
public class nap_chong_phuong_thuc 
{
    public static void main(String[] args) 
    {
        int[]arr1 = new int[]{2, 4, 5};
        double[]arr2 = new double[]{2.6, 6.6, 10.4};

        System.out.println(ArrayCalculator1.minOfArray(arr1));
        System.out.println(ArrayCalculator1.minOfArray(arr2));
        System.out.println(ArrayCalculator1.maxOfArray(arr1));
        System.out.println(ArrayCalculator1.maxOfArray(arr2));
    }
}
