package Array.Program;

public class LargestNumberFind {
	public static void main(String[] args) {

		int[] a = { 19, 30, 59, 58, 100, 9 };

		int max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] >max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
