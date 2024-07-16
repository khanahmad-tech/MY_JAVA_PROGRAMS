package JavaBasics;


class Z {
	Z() {
		System.out.println("Execute Constructor block");
	}
}

public class ProgramInitializer extends Z {
	ProgramInitializer() {
		super();
		System.out.println("2nd Execute Constructor block");
	}

	{
		System.out.println("Execute Initializer block");
	}

	public static void main(String[] args) {
		ProgramInitializer p = new ProgramInitializer();
	}

}
