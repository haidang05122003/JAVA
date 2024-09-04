package Java_nang_cao;

/*Nhập vào một số nguyên dương n, và n số nguyên lần lượt là các phần tử trong dãy a.
Hãy thay đổi giá trị của mỗi phần tử thành bình phương của chính nó, sau đó in mảng đó ra màn hình 
(mỗi phần tử cách nhau bởi một khoảng trắng)
*/
import java.util.Scanner;

public class cau_truc_du_lieu_mang_Array_2 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a = new int[n];

        for(int i = 0; i< n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++)
        {
            a[i] = a[i] * a[i];
        }
        for(int i = 0; i<n; i++)
        {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }   
}
