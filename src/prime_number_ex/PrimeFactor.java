package prime_number_ex;

public class PrimeFactor {

	public static void main(String[] args) {
		int number=12;
		
		for (int i = 1; i<=12; i++) {
			
				if(number%i==0) {
					//System.out.println(i);
					boolean prime = PrimeNoFunction.isPrime(i);
					if(prime) {
						System.out.println(i);
					}
				
			}
		}
		System.out.println();
	}

}
