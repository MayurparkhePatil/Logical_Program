package array_example;

import java.util.Arrays;

public class DeleteElements {

	public static void main(String[] args) {
		
		int[]a= {10,50,60,20,40,30};
		int pos=4;
		
		for (int i =pos-1; i < a.length-1; i++) {
			a[i]=a[i+1];
		}
		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i < a.length-1; i++) {
			System.out.println(a[i]);		
		}
	}
}
