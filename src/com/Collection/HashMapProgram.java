package com.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapProgram {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap();
		hm.put(101, "Ahmad");
		hm.put(102, "Khan");
		hm.put(103, "Husain");
		hm.put(104, "Pathan");
		System.out.println("---------First Way----------");
		System.out.println(hm);// One Way Iterate
		System.out.println("---------Second Way----------");
		Set set = hm.entrySet();
		System.out.println(set);// Second Way Iterate
		System.out.println("---------Third Way----------");
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());// Third Way Iterate
		}
		System.out.println("---------Fourth Way----------");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + "->" + m.getValue());//Fourth Way Iterate

		}
	}

}
