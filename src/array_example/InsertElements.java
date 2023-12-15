package array_example;

import java.util.Arrays;

public class InsertElements {

	public static void main(String[] args) {
		
		int[]a= {10,50,60,20,40,30};
		int pos=3;
		int elements=80;
		int[]b=new int[a.length+1];
		for (int i =0; i < a.length; i++) {
			for (int j = 0; j <=b.length-1; j++) {
				b[j]=a[i];
				b[j+3]=b[j+2];
				b[j+2]=elements;
				
			}
			
		}
		
		System.out.println(Arrays.toString(b));
		
	}
	

}
