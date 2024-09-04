/*Nhập vào một số nguyên dương n, và n số nguyên lần lượt là các phần tử trong dãy a. 
Hãy đưa ra một số nguyên là tổng tất cả các phần tử trong dãy đó.
*/
import java.util.Scanner;

public class cau_truc_du_lieu_mang_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i ++)
        {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i =0 ; i < n; i++)
        {
            sum+=arr[i];
        }
        System.out.print(sum);
        sc.close();
    }
}