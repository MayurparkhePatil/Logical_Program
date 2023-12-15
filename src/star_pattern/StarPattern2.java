package star_pattern;

//* 
//* * 
//* * * 
//* * * * 
//* * * 
//* * 
//* 
public class StarPattern2 {

	public static void main(String[] args) {
		int i=0;
		for ( i = 1; i <=4; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for ( i = 1; i <=4; i++) {
			for (int j =3; j >=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
