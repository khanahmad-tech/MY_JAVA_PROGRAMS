package com.Collection;

import java.util.TreeSet;

public class TreeSetFloorandCielingMethod {

	public static void main(String[] args) {
		TreeSet<Character> ts1 = new TreeSet<Character>();
		ts1.add('B');
		ts1.add('C');
		ts1.add('E');
		ts1.add('A');
		ts1.add('H');
		ts1.add('D');		
		ts1.add('G');
		ts1.add('H');
		ts1.add('J');
		try {
			ts1.add(null);
		} catch (Exception e) {
			System.out.println();
		}
		
		System.out.println(ts1);
		
	}
}
