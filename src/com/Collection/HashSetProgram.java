package com.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetProgram {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Ahmad");
		hs.add("Khan");
		hs.add("age : 18");
		hs.add("My id : 107");
		// System.out.println(hs);
		Iterator itr = hs.iterator();
		while (itr.hasNext())

		{
			System.out.println(itr.next());
		}

	}
}
