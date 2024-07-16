package com.Collection;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapProgram {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(107, "I am java developer");
		tm.put(111, "and You");
		tm.put(110, "I am also java developer");
		
		System.out.println(tm);
		
		System.out.println(tm.containsKey(110));
		
			
		}
	}

