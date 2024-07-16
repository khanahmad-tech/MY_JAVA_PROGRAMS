package Array.Program;

import java.io.Serializable;
import java.util.ArrayList;

public class ArrayListProgram {
	public static void main(String[] args) {
		ArrayList<Serializable> al = new ArrayList<Serializable>();
		al.add("Ahmad");
		al.add("Khan");
		al.add(123);

		al.add("Ahmad");
		al.add(al);

		System.out.println(al);

	}
}
