package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArraylistIteratorProgram {
	public static void main(String[] args) {
		ArrayList<Object> al = new <Object>ArrayList();
		al.add("Ahmad");
		al.add("sameer");
		al.add("zameer");
		
		System.out.println(al);
		
		System.out.println("_________________");

		for (int i = 0; i < 3; i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("_________________");
		
		Iterator itr=al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
			
		}
}

	


