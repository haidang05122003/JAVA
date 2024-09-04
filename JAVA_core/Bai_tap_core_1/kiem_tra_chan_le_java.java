package Bai_tap_core_1;
import java.util.Scanner;

public class kiem_tra_chan_le_java {
	public static void main(String[]args)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap vao so a");
		a = sc.nextInt();
		
		sc.close();
		
		if(a % 2 == 0)
		{
			System.out.println("day la so chan");
		}
		else
		{
			System.out.println("day la so le");
		}
	}
}
