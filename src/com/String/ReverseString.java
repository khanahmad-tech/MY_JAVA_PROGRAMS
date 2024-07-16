package com.String;

public class ReverseString {

	public static void main(String[] args) {
		String s = "MoM";
		String reverse = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
			
		}
		System.out.println(reverse);
		
		if(s.equals(reverse)) {
			System.out.println("Plindrome String");
		}
		else {
			System.out.println("Not palindrome String");
		}
	}
	}
	

