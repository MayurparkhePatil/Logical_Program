package array_example;

//search element using function
public class Utility {
	
	public static boolean searchElement(int[]b,int element) {
		boolean isFound=false;
		for (int i = 0; i < b.length; i++) {
			if(element==b[i]) {
				isFound=true;
				break;
			}
		}
		return isFound;
	}
}

class Test{
	public static void main(String[] args) {
		
		int [] a= {1,5,7,3,6,2,4};
		int [] b= {8,9,7,3,2,0,};
		for (int j = 0; j < a.length; j++) {
			if(Utility.searchElement(b,a[j])) {
				System.out.println(a[j]);
			}
		}	
	}
}
