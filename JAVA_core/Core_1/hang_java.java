
import java.util.Scanner;

public class hang_java {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		final double PI = 3.1456122;
		//tinh chu vi
			int r;
		//nhap vao ban kinh r
			System.out.println("moi ban nhap ban kinh: ");
			
			  r =input.nextInt();
			
		//xuat ra ket qua
			
			System.out.println(r * 2 * PI );
	
			input.close();
	}
}
