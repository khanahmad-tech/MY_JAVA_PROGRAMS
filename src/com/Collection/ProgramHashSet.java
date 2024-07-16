package com.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProgramHashSet {

	public static void main(String[] args) {
		Set s = new HashSet();
		s.add("Ahamd");
		s.add(12);
		s.add(34);
		s.add("Khan");
		System.out.println(s);
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
