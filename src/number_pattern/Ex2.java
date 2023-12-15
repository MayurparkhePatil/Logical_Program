package number_pattern;

//3 2 1 
//3 2 
//3 

public class Ex2 {
	public static void main(String[] args) {
		for (int i =1; i <4; i++) {
			for (int j =3; j >=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
