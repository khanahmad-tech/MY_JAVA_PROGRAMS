package com.String;

public class StringConcatMethod {
	public static void main(String[] args) {
		String s1 = "java is a ";
		String s2 = " programing language.";

		System.out.println(s1.concat(s2));// First Way
		System.out.println(s1 + s2);// Second Way
		System.out.println(s1+"high level"+s2);
	}

}
