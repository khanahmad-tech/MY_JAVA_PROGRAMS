package JavaBasics;

import java.time.LocalDate;

public class RandomNo {
	public static void main(String[] args) {
		System.out.print("Otp Generate:- ");
		System.out.println((int) (Math.random() * 100 * 100));
		System.out.println(LocalDate.now());
		
	}

	
}
 