package com.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		Map m = new HashMap();

		m.put(7, "Ahamd");
		m.put(8, "Husain");
		m.put(9, "Khan");

		System.out.println(m.containsKey(7));
		System.out.println(m.containsValue("Husain"));
		System.out.println(m.size());
		System.out.println(m.get(7));
		System.out.println(m.remove("Husain"));
		System.out.println(m.replace(9, "Pathan"));
		System.out.println(m);

	}
}
