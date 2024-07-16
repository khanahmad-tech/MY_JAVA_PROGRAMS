package Array.Program;

import java.util.Arrays;

public class ArraySortingElement {

	public static void main(String[] args) {
		int[] a = { 9, 3, 7, 8, 5 };

		Arrays.sort(a);
		for (int num : a) {
			System.out.println("Sorting Element :-> " + num);
		}
	}

}
