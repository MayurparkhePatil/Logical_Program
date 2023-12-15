package vowels_string;

public class FindVowelsInString {

	public static void main(String[] args) {
		String s="This is a simple program in java";
		 String s1 = s.toLowerCase();
		 int count=0;
		 int ccount=0;
		 
		 for (int i = 0; i < s1.length(); i++) {
			 if(s1.charAt(i)=='a' || s1.charAt(i)=='e'
			   || s1.charAt(i)=='i'|| s1.charAt(i)=='o'
			   || s1.charAt(i)=='u') {
				 count++;
			 }else {
				 ccount++;
			 }
		}
		 System.out.println("Vowel count is ="+count);
		 System.out.println("Consonant count is ="+ccount);
	}
}
