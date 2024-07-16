package Array.Program;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Mango");
		al.add("Banana");
		al.add("Mango");
		al.add("Apple");
		System.out.println("Before Reversing");
		System.out.println(al.toString());

		Collections.reverse(al);
		System.out.println("After Reversing");
		System.out.println(al);
	}
}