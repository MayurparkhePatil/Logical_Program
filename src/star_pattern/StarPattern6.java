package star_pattern;

public class StarPattern6 {

	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			
		
			for (int j = 0; j <=6; j++) {
				if((i+j==6) ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			for (int j = 1; j <7; j++) {
				if(i==j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			
			
			}
			System.out.println();
		}
	}
}

