import java.util.Scanner;
public class Dezimalzahl_in_Binärzahl {


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
		
	}

}
