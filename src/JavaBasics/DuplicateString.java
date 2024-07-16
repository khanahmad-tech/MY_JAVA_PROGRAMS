package JavaBasics;

public class DuplicateString {
	public static void main(String[] args) {
		String str = "Ahmad";
		char[] c = str.toCharArray();
		findDuplicates(c);
	}

	public static void findDuplicates(char[] c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					System.out.println(c[j]);
				}
			}
		}
	}
}
