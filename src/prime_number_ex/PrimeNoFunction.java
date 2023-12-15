package prime_number_ex;

public class PrimeNoFunction {
	
	public static boolean isPrime(int no) {
		int i=0;
		for(i=2;i<no;i++) {
			if(no%i==0) {
				break;
			}
		}
		if(no==i) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
		System.out.println(isPrime(5));
		System.out.println(isPrime(6));

	}

}
