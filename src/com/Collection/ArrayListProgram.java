package com.Collection;

import java.util.ArrayList;

public class ArrayListProgram {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		System.out.println("ArrayList after adding elements: " + list);

		String elementAtIndex1 = list.get(1);
		System.out.println("Element at index 1: " + elementAtIndex1);

		list.set(1, "Blueberry");
		System.out.println("ArrayList after modification: " + list);

		list.remove(2);
		System.out.println("ArrayList after removing element at index 2: " + list);

		boolean containsApple = list.contains("Apple");
		System.out.println("Does the ArrayList contain 'Apple'? " + containsApple);

		int size = list.size();
		System.out.println("Size of the ArrayList: " + size);

		boolean isEmpty = list.isEmpty();
		System.out.println("Is the ArrayList empty? " + isEmpty);

		list.clear();
		System.out.println("ArrayList after clearing all elements: " + list);
	}
}
