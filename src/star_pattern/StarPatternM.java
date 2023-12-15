package star_pattern;

public class StarPatternM {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			
			for (int j = 1; j <=1; j++) {
				if(j==1 ) {
					System.out.print("*");
				}else {
					System.out.print("  ");
				}
			}
			for(int k =1;k<=5;k++)
				if(i<=3 || i==k) {
					System.out.print("*");
				}else {
					System.out.print("  ");
				}
			System.out.println();
		}
	}
}

