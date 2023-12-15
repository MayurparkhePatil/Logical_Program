package string_example;

import java.util.Scanner;

public class ReverseString1 {
	
	public void printReverse(String str) 
	{
		StringBuilder sb =new StringBuilder(str);
		System.out.println(sb.reverse());
	}
	public static void main(String[] args) {
		ReverseString1 s=new ReverseString1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name ");
		 String name = sc.next();
		s.printReverse(name);
		main(args);
	}

}
