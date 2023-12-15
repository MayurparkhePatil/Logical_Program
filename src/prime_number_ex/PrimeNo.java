package prime_number_ex;

// When the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime number. 

public class PrimeNo {

	public static void main(String[] args) {
	int no=7;
	int j=0;
	for (j = 2; j < no; j++) {
		if(no%j==0)
		{
			System.out.println(no+" numbler is not prime");
			break;
		}
	}
	if(no==j) {
		System.out.println(" number is prime");
	}
	}
}
