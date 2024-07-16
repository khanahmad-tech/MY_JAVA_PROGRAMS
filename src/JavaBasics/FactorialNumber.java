package JavaBasics;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		 int fact = 1;
		System.out.println("Enter any Number: ");
		Scanner r = new Scanner(System.in);
		int n = r.nextInt();

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("factorial " + fact);

	}
}