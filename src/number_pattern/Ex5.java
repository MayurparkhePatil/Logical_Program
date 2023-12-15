package number_pattern;

//12345
//ABCD
//123
//AB
//1


public class Ex5 {

	public static void main(String[] args) {
		
		for (int i = 5; i >=1; i--) {
			char ch='A';
			for (int j =1; j<=i; j++) {
				if(i%2==0)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(ch);
					ch++;
				}
			}
			System.out.println();
		}
	}
}
