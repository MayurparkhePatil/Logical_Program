package number_pattern;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int no=1524;
		System.out.println(no);
		int temp=0;
		while(no!=0) {
			temp=no%10;
			System.out.print(temp);
			no=no/10;
		}
	}
}
