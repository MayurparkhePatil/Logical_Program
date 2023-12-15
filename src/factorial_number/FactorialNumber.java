package factorial_number;

public class FactorialNumber {

	public static void main(String[] args) {
		int no=8;
		int temp=1;
		for (int i =8; i >=1; i--) {
			temp=temp*i;
		}
		System.out.println("Factorial of "+no+" is = "+temp);
	}

}
