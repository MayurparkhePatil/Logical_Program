package armstrong_number;

// An Armstrong Number is a special positive number whose sum of cubes of its digit is equal to that number.
// The number 153 is an Armstrong number because if we perform the sum of cubes of each digit, 
// it will result in the same number.

//153
//15
//1

public class ArmstrongNumber {
	public static void main(String[] args) {
		int no=153;
		while(no!=0) {
			System.out.println(no);
			no=no/10;
		}
	}
}
