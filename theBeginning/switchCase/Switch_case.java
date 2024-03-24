package defaultpackage;
import java.util.*;

import javax.swing.JOptionPane;

public class Switch_case {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.print("Enter your case (0-4):");
		
		int input = Scan.nextInt();
		
		
		switch(input) {
		case 0: 
			System.out.print("case 0");
			break;
		case 1:
			System.out.print("case 1");
			break;
		case 2: 
			System.out.print("case 2");
			break;
		case 3:
			System.out.print("case 3");
			break;
		case 4: 
			System.out.print("case 4");
			break;
		default:
			System.out.print("restart, invalide case!!!");
		}
		
	}
}