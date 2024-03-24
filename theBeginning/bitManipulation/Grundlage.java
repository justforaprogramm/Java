
public class Grundlage {

	public static void main(String[] args) {
		String result = "";
		for(long i = 2146999999 ;i > 0 ; i >>= 1) result = (i&0b1) + result;
		System.out.println(result);
		
	}

}