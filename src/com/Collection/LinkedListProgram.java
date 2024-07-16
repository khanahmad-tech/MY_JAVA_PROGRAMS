package com.Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListProgram {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(null);
		ll.add(10);
		ll.add("Ahamd");
		// System.out.println(ll);

		ListIterator listIterator = ll.listIterator();

		while (listIterator.hasNext()) {

			System.out.println(listIterator.next());

		}
	}
}
