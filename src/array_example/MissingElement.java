package array_example;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		int[] a = { 1, 5, 9, 2, 8, 4 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i]+" ");
			int sum = a[i] + 1;
			while (sum < a[i + 1]) {
				System.out.print(sum+" ");
				sum = sum + 1;
			}
			

		}
	}

}
