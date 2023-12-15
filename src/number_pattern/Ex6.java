package number_pattern;
//1
//12
//123
//1234
//321
//21
//1

public class Ex6 {

	public static void main(String[] args) {
		
		for (int i =1; i <=4; i++) {
			for (int j =1; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for (int i =1; i <=4; i++) {
			for (int j =3; j >=i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
