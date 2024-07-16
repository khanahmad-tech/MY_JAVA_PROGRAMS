package com.String;

public class StrngBufferReplaceMrthod {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello Everyone");
		System.out.println(sb.replace(0, 5, "Goodbye"));
	}
}
