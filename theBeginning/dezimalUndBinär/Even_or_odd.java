import java.util.Scanner;
public class Even_or_odd {
	
	public static boolean isEven(int n) {
		return true;
	}

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int userNum = S.nextInt();
		System.out.println("Is the number even? " + isEven(userNum));
	}

}