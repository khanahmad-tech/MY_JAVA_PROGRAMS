package com.Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumerationIterator {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		
		v.add("Ahmad");
		v.add("Sameer");
		v.add("Zameer");
		v.add(null);
		
		
		ArrayList all = new ArrayList();
		all.add("AssalamuAlaikum");
		System.out.println(all+" "+v.addAll(v));
		Enumeration enu = v.elements();
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
			
		}
	}
}
