/*
 Nhập và một số nguyên dương n, tiếp theo là n số nguyên dương lần lượt là các phần tử của một dãy số, hãy đếm tần số (số lần xuất hiện)
của các số trong dãy và in nó ra màn hình dưới dạng sau: "a1 - t1; a2 - t2; ... an - tn; ", 
 trong đó t1 là số lần xuất hiện của số a1, t2 là số lần xuất hiện của a2, ... a1, a2, .. an k
 hông trùng nhau và được sắp xếp tăng dần 
 */
import java.util.Scanner;
public class cau_truc_du_lieu_mang_Array_6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a = new int[10000];
        int[]b = new int[10000];

        for(int i = 0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        int Max = 0;
        for(int i = 0; i<n; i++)
        {
            if(a[i] > Max)
            {
                Max = a[i];
            }
        }
        for(int i = 0; i<=Max;i++)
        {
            b[i] = 0;
        }
        for(int i = 0; i<n ; i++)
        {
            b[a[i]]+=1;
        }
        for(int i = 0; i<n; i++)
        {
            if(b[i]> 0)
            {
                System.out.print(i + " - " + b[i] + "; ");
            }
        }
        sc.close();
    }
}
