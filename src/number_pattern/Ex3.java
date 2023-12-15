package number_pattern;

//1 2 3 
//4 5 
//6 

public class Ex3 {
	public static void main(String[] args) {
		int k=1;
	for (int i =3; i >=1; i--) {
		for (int j = 1; j<=i; j++,k++) {
			System.out.print(k+" ");
		}
		System.out.println();
	}
	}
}
