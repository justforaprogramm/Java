package defaultpackage;
import java.util.*;

public class Versuch3 {

	public static void main(String[] args) {
				 
	Scanner S = new Scanner(System.in);
	Scanner Sc= new Scanner(System.in);
	String x[] = new String[4];
	int a ;
	int b ;
	int y =0;
	
	x[0] ="rechner \n 1 = mal 2 \n 2 = geteilt durch 2  \n --------------\n eingabe:";
	x[1] ="Zu berechnende zahl:";
	x[2] ="!Fehler!";
	x[3] ="";
	
	System.out.print(x[0]);
	b = S.nextInt();
	System.out.print(x[1]);
	a =S.nextInt();
	
	if(b == 1) {
	a = mal(a);
	
	}
	
	if(b == 2) {
	a = get(a, y);	
	if (y==1) {
		x[3]="\n(rest 0)";
	}
	if (y==2) {
		x[3]="\n(rest 1)";
	}
	}
	
	if (!(b==1 || b==2)) {
		System.out.println(x[2]);
	}
	
	
	
	System.out.print(a);	
	System.out.print(x[3]);
	}
	
	public static int mal(int c) {
		c *= 2; 
		return c;
	}
	public static int get(int d, int y) {
		int temp;
		temp = d /2;
		
		if (!(temp*2 == d)) {
			y=2;
		}
		if (temp*2 == d) {
			y=1;
		}
			
		d /= 2;
		
		return d & y;
		
	}

}