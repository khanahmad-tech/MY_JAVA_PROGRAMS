package com.String;

public class StringBufferAppendMethod {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("My name is Ahmad ");
		System.out.println(str.append("Husain"));
		System.out.println(str.insert(22, " Mohammmad Husain Pathan"));
	}
}
