package array_example;

public class CommomElement {

	public static void main(String[] args) {
		
		int [] a= {1,5,7,6,2,4};
		int [] b= {8,9,7,3,2,0};
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j]) {
					System.out.println(a[j]);
					break;
				}
			}
			
		}

	}

}
