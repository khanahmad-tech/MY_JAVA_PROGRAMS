package Array.Program;

public class ArrayFindSmallNumberProgram {
	public static void main(String[] args) {

		int[] a = { 10, 29, 4, 5, 25 };

		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);
	}
}
