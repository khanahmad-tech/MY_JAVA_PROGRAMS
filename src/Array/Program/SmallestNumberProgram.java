package Array.Program;

public class SmallestNumberProgram {

	public static void main(String[] args) {
		int [] a = {10,28,7,19};
		int min = a[0];
		
		for (int i = 0; i > a.length; i--) {
			if (a[i] < min) {
				min=a[i];
			}
			
		}
		
		System.out.println(min);
	}
}
