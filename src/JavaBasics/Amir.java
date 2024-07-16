package JavaBasics;

   class SingleInheritence {
	void show(String a) {
		System.out.println("Ahmad");
	}
}

 public class Amir extends SingleInheritence {
	void show(int a) {
		System.out.println(007);
	}

	public static void main(String[] args) {
	    Amir a = new Amir();
		a.show("aa");
		a.show(1);
	}
}
