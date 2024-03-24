package defaultpackage;

import java.util.Scanner;

public class Versuch2 {
	public static void main(String[]Args) {
		Scanner Sc =new Scanner(System.in);
		Scanner S =new Scanner(System.in);
		
		System.out.println("Multiplikation:");
		int a = Sc.nextInt();
		System.out.println("*");
		int b = S.nextInt();
		a = Re(a, b);
		System.out.println(a);
		
		boolean e = true;
		if (a < 0) {
			e = false;
		}
		if(e == false) {
			System.out.println("info: antwort im minusbereich");
		}
		
		
		}
	public static int Re(int c, int d) {
		c *= d;
		return c;
    }
}