
public class switchCase2 {

	public static void main(String[] args) {
		
		int month = 2;
		
		
		switch(month) {
		case 1: System.out.println("Januar"); break;
		case 2: System.out.println("Februar"); break;
		default: System.out.println("?"); break;
		}
		
		String day = "Dienstag";
		
		switch(day) {
		case "Montag": System.out.println("Montag"); 
		case "Dienstag": System.out.println("Dienstag");
		default: System.out.println("ein Wochentag");
		}
	}

}
