import java.util.Scanner;

public class Beispiel_mit_Multiplikation {

	public static void main(String[] args) {
		Scanner Sc =new Scanner(System.in);
		Scanner S =new Scanner(System.in);
		String[] B =new String[4];
		
		int N1;
		int N2;
		B[0] ="Multiplikation:";
		B[1] ="*";
		B[2] ="= ";
		B[3] ="--------------------------";
		
		System.out.println(B[0]);
		N1 = Sc.nextInt();
		System.out.println(B[1]);
		N2 = S.nextInt();
		
		int k = N1 * N2;
		
		System.out.println(B[2]);
		System.out.println(k);
		System.out.println(B[3]);

	}

}
