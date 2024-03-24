import java.util.Scanner;
public class Tree_Times_D_in_B {

	public static void main(String[] args) {
		
		Scanner Sc= new Scanner(System.in);
		int i;
		System.out.println("Dezimalzahl eingeben: ");
		i = Sc.nextInt();
		System.out.print("= ");
		
		String result = "";
		while(i > 0) {
		  result = i%2 + result;
		  i /= 2;
		}
		System.out.println(result + "b");
		
		int b;
		System.out.println("Dezimalzahl eingeben: ");
		b = Sc.nextInt();
		System.out.print("= ");
		
		String resul = "";
		while(b > 0) {
		  resul = b%2 + resul;
		  b /= 2;
		}
		System.out.println(resul + "b");
		
		int c;
		System.out.println("Dezimalzahl eingeben: ");
		c = Sc.nextInt();
		System.out.print("= ");
		
		String resu = "";
		while(c > 0) {
		  resu = c%2 + resu;
		  c /= 2;
		}
		System.out.print(resu + "b");

		
	}

}
