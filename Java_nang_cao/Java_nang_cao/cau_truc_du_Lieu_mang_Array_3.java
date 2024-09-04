package Java_nang_cao;

/*
 Nhập vào một số nguyên dương n, và n số nguyên lần lượt là các phần tử trong dãy a. 
Tiếp theo nhập vào hai số nguyên là k và x (0 ≤ k ≤ n).
Hãy chèn phần tử có giá trị x vào dãy a, ở trước phần tử có chỉ số k và sau phần tử có chỉ số k-1. 
In mảng kết quả ra màn hình, mỗi số cách nhau bởi một khoảng trắng.
 */
import java.util.Scanner;
public class cau_truc_du_Lieu_mang_Array_3 
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n + 1];

        for(int i = 0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }

        int k = sc.nextInt();
        int x = sc.nextInt();
        
        for(int i = n; i>= k+1; i--)
        {
            a[i] = a[i-1];
        }
        a[k] = x;
        n++;

        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
