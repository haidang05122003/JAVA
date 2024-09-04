/*
Nhập vào một số nguyên dương n, và n số nguyên lần lượt là các phần tử trong dãy a. 
Tiếp theo nhập vào số nguyên là k (0 ≤ k < n).
Hãy xóa phần tử có chỉ số k ở trong dãy đó. 
In mảng kết quả ra màn hình, sau mỗi phần tử có đúng một khoảng trắng.

 */
import java.util.Scanner;
public class cau_truc_du_lieu_mang_Array_4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n+1];

        for(int i = 0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i = k; i<n; i++)
        {
            a[i]= a[i+1];
        }
        n--;
        for(int i = 0; i<n; i++)
        {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
