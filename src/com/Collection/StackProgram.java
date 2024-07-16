package com.Collection;

import java.util.Vector;
import java.util.Stack;

public class StackProgram {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add("Ahmad");
		v.add(19);

		System.out.println(v);
		System.out.println("--------------------------------");

		Stack s = new Stack();
		s.add("Ahmad ");
		s.add("Husain");
		s.add(18);
		s.add(10.10);

		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
	}
}
