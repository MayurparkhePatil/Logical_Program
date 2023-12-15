package stringbuffer_example;

public class ReverseString2 {

	public static void main(String[] args) {
		
		
		StringBuffer sb = new StringBuffer("Mayur");
		
		for (int i =sb.length()-1; i>=0; i--) {
			System.out.print(sb.charAt(i));
			;
		}
		
	}

}
