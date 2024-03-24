
    //noch nicht Funktionstüchtig

import java.util.*;
public class Potenz {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Scanner sca =new Scanner(System.in);
		String[] St =new String[3];
		St[0] ="Potenzieren:";
		St[1] ="^";
		St[2] ="=";
		
		
		System.out.println(St[0]);
		double b= sc.nextDouble();
		System.out.println(St[1]);
		double e=sca.nextDouble();
		System.out.print(St[2]);
		
	System.out.print(pb(b,e));

	}
	public static double pb(double b, double e) {
		
		double p = 1;
		
		if(b > 0 & e > 0) {
			for(int i=1;i<=e;i++) {
				p = p * b;	
			    }
		}
		
		if(b<0 ) {
		
			if(b > 0|e > 0) {
				for(int i=1;i<=e;i++) {
					p = p * b;	
				    }
				
			}
			    
		}
		
		if(!(b > 0 & e > 0)) {
			for(int i=1;i<=e;i++) {
				p = p * b;	
			    }
		}
		
		return p;
	}

}
