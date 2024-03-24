
public class Array {
	public static void main(String[] args) {
		
	
	String test = "Hello" + " World";        
	System.out.println(test);               
	
	
	String[]names =new String[3];  //Die größe eines Arrayswird immer bei der Initialisierung festgelegt.
	
	names[0] = "Hendrik";
	names[1] = "Paul";
	names[2] = "Fabienne";
	
	System.out.println(names[1]);
	System.out.println(names[0]);
	System.out.println(names[2]);
	
	String[]zahlen =new String[7];
	
	zahlen[0] = " 8 0 0 0";
	zahlen[1] = " 0 8 0 0";
	zahlen[2] = " 0 0 8 0";
	zahlen[3] = " 0 0 0 8";
	zahlen[4] = " 0 0 8 0";
	zahlen[5] = " 0 8 0 0";
	zahlen[6] = " 8 0 0 0";
    
    for(int i = 0; i < zahlen.length; i++) {
    	System.out.println(zahlen[i]);
    }
	
	}
}
