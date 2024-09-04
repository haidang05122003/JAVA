

public class toan_tu_java {
	public static void main (String[] args) {
		int a = 1;
		//in ra roi moi tang
		System.out.println(a++); //ket thuc moi cong a len a = 2
		//tang roi moi in ra
		System.out.println(++a); //a = 2 + them 1  = 3
		//cong 1 va in ra roi moi tang
		System.out.println(a+++1); // a = 3 + 1 in roi moi tang
		//tang roi moi cong 1 va in ra
		System.out.println(++a+1); // a o tren tang len la 4 tang them 1 = 5 + 1 = 6 roi in ra
	}
}
