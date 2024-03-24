import java.util.Scanner;

public class Immer_nur_zwei_zahlen_adieren {

	public static void main(String[] args) {
		Scanner Sc =new Scanner(System.in);
		Scanner S =new Scanner(System.in);
		
		System.out.println("addition:");
		int i = Sc.nextInt();
		System.out.print(" + ");
		int h = S.nextInt();
	    int j = 0;
	    if(h > 10){
	    h= h - 10;
	    j= j + 10;
	    }
	    if(i > 10) {
	    i = i - 10;
	    j = j + 10;	
	    }
	    
	    int a = h + i;
	        a = a + j;
	    
		System.out.println("= " + a);
		

	}

}
