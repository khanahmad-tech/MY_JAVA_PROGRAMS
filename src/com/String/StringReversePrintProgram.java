package com.String;

public class StringReversePrintProgram {

	public static void main(String[] args) {
		String s1 = "My is name Ahmad";
		
		for (int i = s1.length()-1;i >=0;i--) {
			System.out.print(s1.charAt(i));
		}
	}
}
