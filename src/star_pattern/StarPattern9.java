package star_pattern;

//  * * * * * * 
//  *         * 
//  *         * 
//  *         * 
//  * * * * * * 
//  *  *        
//  *    *      
//  *      *    
//  *        *  
//    

public class StarPattern9 {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			
			for (int j = 1; j <=5; j++) {
				if(i==1 || j==1 || i==5 || j==5) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=2;i<=5;i++) {
			for(int j=1; j<=5;j++) {
				if((i==j )|| (j==1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
	}
}

