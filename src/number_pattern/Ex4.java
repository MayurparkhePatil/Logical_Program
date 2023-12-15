package number_pattern;
//6
//5 4
//3 2 1
public class Ex4 {

	public static void main(String[] args) {
		int k=6;
		for (int i = 1; i <4; i++) {
			for (int j =1; j <=i; j++,k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
