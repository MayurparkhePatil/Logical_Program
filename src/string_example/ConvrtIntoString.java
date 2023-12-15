package string_example;

import java.util.Scanner;

public class ConvrtIntoString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number ");
		int no = sc.nextInt();//125
		StringBuffer sb=new StringBuffer();
		
		String[]s= {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		while(no!=0) {
			int digit=no%10;
			sb.append(s[digit]+" ");
			no=no/10;	
		}
		System.out.println(sb);
		
		for (int i =sb.length()-1; i <0; i--) {
			System.out.println(i);
			
		}
	}

}
