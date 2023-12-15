package pallendrom_example;

public class StringPallendrom {

	public static void main(String[] args) {
		
		String s="RAdAR";
		String s2 = s.toLowerCase();
		String reverse="";
		for (int i =s2.length()-1; i>=0; i--) {
			reverse=reverse+s2.charAt(i);
		}
		if(s2.equals(reverse)) {
			System.out.println("given string is palendrom");
		}
		else
		{
			System.out.println("given string is not palendrom");
		}
	}
}
