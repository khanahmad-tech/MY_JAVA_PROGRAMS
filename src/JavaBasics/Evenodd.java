
package JavaBasics;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		System.out.println("Enter Any Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println("This is Even Nummber");
		} else {
			System.out.println("This is Odd number");
		}

	}

}
