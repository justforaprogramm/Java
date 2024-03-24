

public class foreach {

	public static void main(String[] args) {
		
		String[]names = {"Hendrik", "Paul", "Fabienne"};         //Computer Definiert String[3]
		
		for(int i =0; i < names.length; i++)  {
	 	System.out.println(names[i]);
		}
		
		for(String name : names) {
			System.out.println(name);
		}
	}

}
