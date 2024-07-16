package com.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetFirsandLastMethodProgram {

	public static void main(String[] args) {
		TreeSet<Object> ts = new TreeSet<Object>();
		ts.add("Ahmad");
		ts.add("Khan");
		ts.add("Husain");
		// ts.add(23);
		// System.out.println(ts.last());
		// System.out.println(ts.first());

		Iterator itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}

}
