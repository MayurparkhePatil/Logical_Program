package vowels_string;

public class FindVowelsInString2 {
	// how much time vowels character are present in string
	public static void main(String[] args) {
		String s="This is a simple program in java ";
		 String s1 = s.toLowerCase();
		 int acount=0;
		 int ecount=0;
		 int icount=0;
		 int ocount=0;
		 int ucount=0;
		 for (int i = 0; i < s1.length(); i++) {
			 if(s1.charAt(i)=='a') {
					acount++;
				}
			 else if (s1.charAt(i)=='e') {
					ecount++;
				}
			 else if (s1.charAt(i)=='i') {
					icount++;
				}
			 else if (s1.charAt(i)=='o') {
					ocount++;
				}
			 else if (s1.charAt(i)=='u') {
					ucount++;
				}
		}
		 System.out.println("acount "+acount);
		 System.out.println("ecount "+ecount);
		 System.out.println("icount "+icount);
		 System.out.println("ocount "+ocount);
		 System.out.println("ucount "+ucount);
		
		 
	}
}
