package comArray;

public class ArraySmallestNumber {
	public static void main(String[] args) {
		int []a= {10,20,30,5,40,50,60};
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]<min) {
				min = a[i];
			}
		}
		System.out.println(min);
	}
}
