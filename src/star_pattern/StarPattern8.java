package star_pattern;

//*         *
//*         *
//*         *
//*         *
//*         *
//  *  *  *
// 
            

public class StarPattern8 {

	public static void main(String[] args) {
		for (int i = 0; i <=4; i++) {
			
			for (int j = 0; j <=10; j++) {
				if((j==0 || j==10)) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=1;i++) {
			for(int j=i; j<=3;j++) {
				System.out.print("  *");
			}
		}
		
		
	}
}

