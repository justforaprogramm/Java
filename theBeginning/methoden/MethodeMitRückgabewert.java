
public class MethodeMitRückgabewert {
	
	public static void main(String[] args) {
		
		System.out.println("Vor");
		int s = 30;
		int R = DS(s, 50);
		System.out.println(R);
		System.out.println("Nach");

	}
	
	public static int DS(int N1, int N2) {             // int ist der ausgabewert, void heißt nur das es eine Methode ist
		int result = N1 + N2;
		return result;               // Return ist wichtig
		
	}
	
}
