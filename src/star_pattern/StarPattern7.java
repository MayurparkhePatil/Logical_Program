package star_pattern;

//*         *  
// *       *   
//  *     *    
//   *   *     
//    * *      
//     *       
//     *
//     *



public class StarPattern7 {

	public static void main(String[] args) {
		for (int i = 0; i <=7; i++) {
			
			for (int j = 0; j <=7; j++) {
				if(i==j) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				}
			}
			for (int j = 0; j <=6; j++) {
				if((i+j==6) ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
		}
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=7;j++) {
				if(j==7) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

