package Bai_tap_core_1;
import java.util.Scanner;

public class cong_2_so_java_1 {
	public static void main(String[]args)
	{
		int a , b, c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("nhap vao so a");
		a = sc.nextInt();
		
		System.out.println("Nhap vao so b");
		b = sc.nextInt();
		
		sc.close();
		c = a + b;
		System.out.println("Tong a b la: "+c);
	}
}
