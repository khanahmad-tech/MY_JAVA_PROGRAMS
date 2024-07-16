package Array.Program;

public class ReversTwoDArray {
	public static void main(String[] arg) {
		int[][] a = { { 10, 20, 30 }, { 40, 50 } };

		for (int i = a.length - 1; i >= 0; i--) {
			for (int j = a[i].length - 1; j >= 0; j--) {
				System.out.println(a[i][j]);
			}
		}
	}
}