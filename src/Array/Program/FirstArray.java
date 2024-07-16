package Array.Program;

public class FirstArray {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println("------------------");
		// for(int i=0; i<a.length; i++) {
		// System.out.println(a[i]);
		// System.out.println();
		// }
		//System.out.println("_____________________");
		for (int j : a) {
			System.out.println(j);
		}

	}
}
