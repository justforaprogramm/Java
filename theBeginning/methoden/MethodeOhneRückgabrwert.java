
public class MethodeOhneRückgabrwert {

	public static void main(String[] args) {
		
		System.out.println("Vor");
		DS(20, 20);
		System.out.println("Nach");

	}
	
	public static void DS(int N1, int N2) {
		
		int x = N1;
		int y = N2;
		int result = x + y;
		System.out.println( result);
		
	}
	
}
