package Array.Program;

public class SmallAndLargeNumberPrint {
	public static void main(String[] args) {
		int[] a = { 12, 34, 1, 45, 10 };
		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			} else if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min + " " + max);

	}
}
