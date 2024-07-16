package com.String;

public class StringComparisionEquals {
	public static void main(String[] args) {
		String s1 = "Ahmad";
		String s2 = "ahmad";

		System.out.println(s1.equals(s2));//false
		//boolean yani true false return karta hai:  
		System.out.println(s1.equalsIgnoreCase(s2));
		 System.out.println(s1.compareTo(s2));//-32
	}
}
