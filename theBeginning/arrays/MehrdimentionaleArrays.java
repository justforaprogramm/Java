

public class MehrdimentionaleArrays {

	public static void main(String[] args) {
		
		String[][] FALN = new String[4][2];
		
		FALN[0][0] = "Franz";
		FALN[0][1] = "Bauer";
		
		FALN[1][0] = "Felix";
		FALN[1][1] = "Huber";
		
		FALN[2][0] = "Fritz";
		FALN[2][1] = "Mayer";
		
		FALN[3][0] = "Max ";
		FALN[3][1] = "Musterman";
		
		//Äußere forSchleife: ZeilenIndex => i
		//Äußere forSchleife: Spaltenindex => j
		for(int i = 0; i < FALN.length; i++) {
			for(int j = 0; j < FALN[i].length; j++) {
				System.out.print(FALN[i][j] + " ");
			}
			System.out.println();
		}
	}

}