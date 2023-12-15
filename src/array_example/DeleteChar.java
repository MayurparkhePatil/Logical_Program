package array_example;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteChar {

	public static void main(String[] args) {
		
		char[] a= {'J','A','V','A'};
		int i=0;
		System.out.println(Arrays.toString(a));
		System.out.println("Enter character to delete = ");
		Scanner sc= new Scanner(System.in);
		char ch=sc.next().charAt(0);
		System.out.println(ch);
		
		while(true) {
			if(a[i]==ch) {
				break;
			}
			i++;
		}
		for (int j = i; j < a.length-1; j++) {
			a[j]=a[j+1];
		}
		System.out.println(Arrays.toString(a));
		for (int j = 0; j < a.length-1; j++) {
			System.out.println(a[j]);
		}

	}

}
