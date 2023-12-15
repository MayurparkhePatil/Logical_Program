package fibonacci_serries;

public class FibonacciWithoutRecursion {
//    0 1 1 2 3 5
	public static void main(String[] args) {
		int no1=0;  int no2=1; int no3;  int count=5;
		System.out.print(no1+" "+no2);
		for(int i=2; i<=count; i++)
		{
			no3=no1+no2;
		System.out.print(" "+no3);
		no1=no2;
		no2=no3;
			
		}

	}

}
