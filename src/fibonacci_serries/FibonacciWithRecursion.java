package fibonacci_serries;


//  Fibonacci series is a special type of series in which the next term is the sum of the previous two terms. 
//  For example, if 0 and 1 are the two previous terms in a series, then the next term will be 1(0+1).

public class FibonacciWithRecursion {

	static int no1=0;
	static int no2=1;
	static int no3=0;
	
	public static void fibo(int count) {
		if(count>0) {
			no3=no1+no2;
			no1=no2;
			no2=no3;
			System.out.print(" "+no3);
			fibo(count-1);
		}
		
	}
	
	public static void main(String[] args) {
		int round=5;
		System.out.print(no1+" "+no2);
		fibo(round);
	}

}
