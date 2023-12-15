package prime_number_ex;

public class PrimeNo1 {
	public static void main(String[] args) {
		int i =0;
		for(int no=1;no<=300;no++)
		{
			for ( i = 2; i <no; i++) {
				
					if(no%i==0) {
						break;
					}
				
		}//inner for loop completed
			if(no==1) {
			System.out.println(1);
		}
			
			if(no==i) {
				System.out.println(no);
			}
			
		}//outer loop completed
		
	}//main loop completed
}
