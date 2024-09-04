package Lop_doi_tuong_bien_phuong_thuc_tinh;

class ArrayCalculator
{
    public static int sumOfArray(int arr[])
    {
        int sum = 0;
        for(int i = 0; i< arr.length; i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
    public static double sumOfArray(double arr[])
    {
        double sum = 0;
        for(int i = 0; i< arr.length; i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
}
public class Chong_phuong_thuc 
{
    public static void main(String[] args) 
    {
        int[]arr1 = new int[]{2,3,5};
        double[]arr2 = new double[]{2.6,3.7,5.7};
        System.out.println(ArrayCalculator.sumOfArray(arr1));
        System.out.println(ArrayCalculator.sumOfArray(arr2));
    }
}
